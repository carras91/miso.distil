package miso.carrascal.codeGenerator.generator.services

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Service
import java.util.ArrayList
import java.util.HashMap
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import codeGeneratorModel.OnService

class generateServicesSpark {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	def info(EList<Service> services) {
		var map = new HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>>()
		for(service : services) {
			for(onService : service.when as EList<OnService>) {
				if(map.containsKey(onService.artifact)) {
					for(when : onService.whenServices as EList<ServiceEnum>) {
						if(map.get(onService.artifact).containsKey(when)) {
							map.get(onService.artifact).get(when).add(service)
						} else {
							var list = new ArrayList<Service>()
							list.add(service)
							map.get(onService.artifact).put(when, list)
						}
					}
				} else {
					var inMap = new HashMap<ServiceEnum, ArrayList<Service>>()
					for(when : onService.whenServices as EList<ServiceEnum>) {
						var list = new ArrayList<Service>()
						list.add(service)
						inMap.put(when, list)
					}
					map.put(onService.artifact, inMap)
				}
			}
		}
		return map
	}
		
	def write(EList<Service> services) '''
		«var map = services.info»
		package «pack.ServicesCha»;

		import java.util.ArrayList;
		«var arrays = false»
		«FOR inMap : map.values»
			«IF !arrays && (inMap.containsKey(ServiceEnum.READ_ALL_LITERAL) || inMap.containsKey(ServiceEnum.SEARCH_LITERAL))»
				«{arrays = true; null}»
				import java.util.Arrays;
			«ENDIF»
		«ENDFOR»
		import java.util.List;

		import static spark.Spark.post;
		«var upload = false»
		«FOR inMap : map.values»
			«IF !upload && (inMap.containsKey(ServiceEnum.UPLOAD_LITERAL) || inMap.containsKey(ServiceEnum.READ_ALL_LITERAL) || inMap.containsKey(ServiceEnum.SEARCH_LITERAL))»
				«{upload = true; null}»
				import static spark.Spark.after;

				import com.google.gson.Gson;
				import com.google.gson.JsonSyntaxException;
			«ENDIF»
		«ENDFOR»

		import «pack.MisoBasic».JsonTransformer;
		import «pack.MisoBasic».BasicInterfaceSpark;
		import «pack.MisoAbstract».AbstractPersistentClass;
		import «pack.MisoAbstract».RecordDB;

		«FOR artifact : map.keySet»
			«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD_LITERAL) || map.get(artifact).containsKey(ServiceEnum.UPDATE_LITERAL) || map.get(artifact).containsKey(ServiceEnum.READ_LITERAL)»
				import «pack.getBasicChar(artifact)».Basic«artifact.name»Param;
			«ENDIF»
			«IF !map.get(artifact).keySet.empty»
				import «pack.getBasicChar(artifact)».Basic«artifact.name»Spark;
				import «pack.getArtifactChar(artifact)».«artifact.name»;
			«ENDIF»
		«ENDFOR»

		public final class ServicesSpark implements BasicInterfaceSpark {

			«FOR service : services»
				public static String «service.name»Url = "/service/«service.name.toLowerCase»/";
			«ENDFOR»

			@Override
			public void runService() {
				«FOR service : services»

					Service«service.name» service«service.name» = new Service«service.name»();
					post(«service.name»Url, "application/json",
						(request, response) -> {
							List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
							return service«service.name».runService(request, response, list);
						}, new JsonTransformer());
				«ENDFOR»
				«FOR artifact : map.keySet»
					«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD_LITERAL)»

						after(Basic«artifact.name»Spark.DownloadZipIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.DOWNLOAD_LITERAL)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});

						after(Basic«artifact.name»Spark.DownloadFileIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.DOWNLOAD_LITERAL)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ_LITERAL)»

						after(Basic«artifact.name»Spark.ReadIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.READ_LITERAL)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPDATE_LITERAL)»

						after(Basic«artifact.name»Spark.UpdateJson, "application/json",
								(request, response) -> {
									String id = request.queryParams(Basic«artifact.name»Param.IdPost);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.UPDATE_LITERAL)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPLOAD_LITERAL)»

						after(Basic«artifact.name»Spark.UploadJson, "application/json",
								(request, response) -> {
									try {
							            AbstractPersistentClass artifact = ((AbstractPersistentClass)(new Gson()).fromJson(response.body(), «artifact.name».class));
										List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
										list.add(artifact);
										«FOR service : map.get(artifact).get(ServiceEnum.UPLOAD_LITERAL)»
											service«service.name».runService(request, response, list);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ_ALL_LITERAL)»

						after(Basic«artifact.name»Spark.ReadAllJson, "application/json",
								(request, response) -> {
									try {
										AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);
							            List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));
										«FOR service : map.get(artifact).get(ServiceEnum.READ_ALL_LITERAL)»
											service«service.name».runService(request, response, newList);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.SEARCH_LITERAL)»

						after(Basic«artifact.name»Spark.SearchJson, "application/json",
								(request, response) -> {
									try {
										AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);
							            List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));
										«FOR service : map.get(artifact).get(ServiceEnum.SEARCH_LITERAL)»
											service«service.name».runService(request, response, newList);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
				«ENDFOR»
			}
		}
	'''
}