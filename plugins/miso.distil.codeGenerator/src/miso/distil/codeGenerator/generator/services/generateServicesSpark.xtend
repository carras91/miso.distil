package miso.distil.codeGenerator.generator.services

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Service
import java.util.ArrayList
import java.util.HashMap
import codeGeneratorModel.Artifact
import codeGeneratorModel.ServiceEnum
import codeGeneratorModel.OnService

/*
 * To write ServicesSpark.java
 * 
 * @author Carlos Carrascal
 */
class generateServicesSpark {
	
	@Inject miso.distil.codeGenerator.generator.Names names

	/*
	 * To get each artifacts list of services and when they are triggered
	 * 
	 * @author Carlos Carrascal
	 */
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

	/*
	 * To write ServicesSpark.java
	 * 
	 * @author Carlos Carrascal
	 */	
	def write(EList<Service> services) '''
		«var map = services.info»
		package «names.ServicesCha»;

		import java.util.ArrayList;
		«var arrays = false»
		«FOR inMap : map.values»
			«IF !arrays && (inMap.containsKey(ServiceEnum.READ_ALL) || inMap.containsKey(ServiceEnum.SEARCH))»
				«{arrays = true; null}»
				import java.util.Arrays;
			«ENDIF»
		«ENDFOR»
		import java.util.List;

		import static spark.Spark.post;
		«var upload = false»
		«FOR inMap : map.values»
			«IF !upload && (inMap.containsKey(ServiceEnum.UPLOAD) || inMap.containsKey(ServiceEnum.READ_ALL) || inMap.containsKey(ServiceEnum.SEARCH))»
				«{upload = true; null}»
				import static spark.Spark.after;

				import com.google.gson.Gson;
				import com.google.gson.JsonSyntaxException;
			«ENDIF»
		«ENDFOR»

		import «names.MisoBasic».JsonTransformer;
		import «names.MisoBasic».BasicInterfaceSpark;
		import «names.MisoAbstract».AbstractPersistentClass;
		import «names.MisoAbstract».RecordDB;

		«FOR artifact : map.keySet»
			«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD) || map.get(artifact).containsKey(ServiceEnum.UPDATE) || map.get(artifact).containsKey(ServiceEnum.READ)»
				import «names.getBParamFileChar(artifact)»;
			«ENDIF»
			«IF !map.get(artifact).keySet.empty»
				import «names.getBSparkFileChar(artifact)»;
				import «names.getArtifactFileChar(artifact)»;
			«ENDIF»
		«ENDFOR»

		/**
		 * Auto-generated services spark server
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public final class ServicesSpark implements BasicInterfaceSpark {

			// URL's
			«FOR service : services»
				public static String «service.name»Url = "/service/«service.name.toLowerCase»/";
			«ENDFOR»

			/**
			 * Auto-generated services spark service. It initializes all services url's
			 * 
			 * @author miso.distil.codeGenerator
			 */
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
					«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD)»

						after(Basic«artifact.name»Spark.DownloadZipIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.DOWNLOAD)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});

						after(Basic«artifact.name»Spark.DownloadFileIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.DOWNLOAD)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ)»

						after(Basic«artifact.name»Spark.ReadIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.READ)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPDATE)»

						after(Basic«artifact.name»Spark.UpdateJson, "application/json",
								(request, response) -> {
									String id = request.queryParams(Basic«artifact.name»Param.IdPost);
									AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
									list.add(artifact);
									«FOR service : map.get(artifact).get(ServiceEnum.UPDATE)»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPLOAD)»

						after(Basic«artifact.name»Spark.UploadJson, "application/json",
								(request, response) -> {
									try {
							            AbstractPersistentClass artifact = ((AbstractPersistentClass)(new Gson()).fromJson(response.body(), «artifact.name».class));
										List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();
										list.add(artifact);
										«FOR service : map.get(artifact).get(ServiceEnum.UPLOAD)»
											service«service.name».runService(request, response, list);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ_ALL)»

						after(Basic«artifact.name»Spark.ReadAllJson, "application/json",
								(request, response) -> {
									try {
										AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);
							            List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));
										«FOR service : map.get(artifact).get(ServiceEnum.READ_ALL)»
											service«service.name».runService(request, response, newList);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.SEARCH)»

						after(Basic«artifact.name»Spark.SearchJson, "application/json",
								(request, response) -> {
									try {
										AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);
							            List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));
										«FOR service : map.get(artifact).get(ServiceEnum.SEARCH)»
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