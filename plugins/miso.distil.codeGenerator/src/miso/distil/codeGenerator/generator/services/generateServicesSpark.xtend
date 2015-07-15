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
		«var ArrayList<Service> listServices = new ArrayList<Service>()»
		package «names.ServicesCha»;

		import java.util.ArrayList;
		«var arrays = false»
		«FOR inMap : map.values»
			«IF !arrays && (inMap.containsKey(ServiceEnum.READ_ALL) || inMap.containsKey(ServiceEnum.ALL) || inMap.containsKey(ServiceEnum.SEARCH))»
				«{arrays = true; null}»
				import java.util.Arrays;
			«ENDIF»
		«ENDFOR»
		import java.util.List;

		import static spark.Spark.post;
		«var upload = false»
		«FOR inMap : map.values»
			«IF !upload && (inMap.containsKey(ServiceEnum.UPLOAD)|| inMap.containsKey(ServiceEnum.ALL) || inMap.containsKey(ServiceEnum.READ_ALL) || inMap.containsKey(ServiceEnum.SEARCH))»
				«{upload = true; null}»
				import static spark.Spark.after;

				import com.google.gson.Gson;
				import com.google.gson.JsonSyntaxException;
			«ENDIF»
		«ENDFOR»

		import «names.MisoBasic».JsonTransformer;
		import «names.MisoBasic».BasicInterfaceSpark;
		import «names.MisoAbstract».Persistent;
		import «names.MisoAbstract».RecordDB;

		«FOR artifact : map.keySet»
			«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD) || map.get(artifact).containsKey(ServiceEnum.UPDATE) || map.get(artifact).containsKey(ServiceEnum.ALL) || map.get(artifact).containsKey(ServiceEnum.READ)»
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
							List<Persistent> list = new ArrayList<Persistent>();
							return service«service.name».runService(request, response, list);
						}, new JsonTransformer());
				«ENDFOR»
				«FOR artifact : map.keySet»
					«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.DownloadZipIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									Persistent artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<Persistent> list = new ArrayList<Persistent>();
									list.add(artifact);
									«{listServices.clear; null}»
									«IF map.get(artifact).containsKey(ServiceEnum.DOWNLOAD)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.DOWNLOAD)); null}»
									«ENDIF»
									«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
									«ENDIF»
									«FOR service : listServices»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});

						after(Basic«artifact.name»Spark.DownloadFileIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									Persistent artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<Persistent> list = new ArrayList<Persistent>();
									list.add(artifact);
									«FOR service : listServices»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.ReadIdJson, "application/json",
								(request, response) -> {
									String id = request.params(Basic«artifact.name»Param.IdGet);
									Persistent artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<Persistent> list = new ArrayList<Persistent>();
									list.add(artifact);
									«{listServices.clear; null}»
									«IF map.get(artifact).containsKey(ServiceEnum.READ)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.READ)); null}»
									«ENDIF»
									«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
									«ENDIF»
									«FOR service : listServices»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPDATE) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.UpdateJson, "application/json",
								(request, response) -> {
									String id = request.queryParams(Basic«artifact.name»Param.IdPost);
									Persistent artifact = RecordDB.getDefault().readOne(id, «artifact.name».class);
									List<Persistent> list = new ArrayList<Persistent>();
									list.add(artifact);
									«{listServices.clear; null}»
									«IF map.get(artifact).containsKey(ServiceEnum.UPDATE)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.UPDATE)); null}»
									«ENDIF»
									«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
										«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
									«ENDIF»
									«FOR service : listServices»
										service«service.name».runService(request, response, list);
									«ENDFOR»
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.UPLOAD) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.UploadJson, "application/json",
								(request, response) -> {
									try {
							            Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), «artifact.name».class));
										List<Persistent> list = new ArrayList<Persistent>();
										list.add(artifact);
										«{listServices.clear; null}»
										«IF map.get(artifact).containsKey(ServiceEnum.UPLOAD)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.UPLOAD)); null}»
										«ENDIF»
										«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
										«ENDIF»
										«FOR service : listServices»
											service«service.name».runService(request, response, list);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.DELETE) || map.get(artifact).containsKey(ServiceEnum.ALL)»
					
						after(Basic«artifact.name»Spark.DeleteJson, "application/json",
								(request, response) -> {
									try {
							            Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), «artifact.name».class));
										List<Persistent> list = new ArrayList<Persistent>();
										list.add(artifact);
										«{listServices.clear; null}»
										«IF map.get(artifact).containsKey(ServiceEnum.DELETE)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.DELETE)); null}»
										«ENDIF»
										«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
										«ENDIF»
										«FOR service : listServices»
											service«service.name».runService(request, response, list);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.READ_ALL) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.ReadAllJson, "application/json",
								(request, response) -> {
									try {
										Persistent[] list = (new Gson()).fromJson(response.body(), Persistent[].class);
							            List<Persistent> newList = new ArrayList<Persistent>(Arrays.asList(list));
										«{listServices.clear; null}»
										«IF map.get(artifact).containsKey(ServiceEnum.READ_ALL)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.READ_ALL)); null}»
										«ENDIF»
										«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
										«ENDIF»
										«FOR service : listServices»
											service«service.name».runService(request, response, newList);
										«ENDFOR»
									} catch (JsonSyntaxException e) {
										e.printStackTrace();
									}
								});
					«ENDIF»
					«IF map.get(artifact).containsKey(ServiceEnum.SEARCH) || map.get(artifact).containsKey(ServiceEnum.ALL)»

						after(Basic«artifact.name»Spark.SearchJson, "application/json",
								(request, response) -> {
									try {
										Persistent[] list = (new Gson()).fromJson(response.body(), Persistent[].class);
							            List<Persistent> newList = new ArrayList<Persistent>(Arrays.asList(list));
										«{listServices.clear; null}»
										«IF map.get(artifact).containsKey(ServiceEnum.SEARCH)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.SEARCH)); null}»
										«ENDIF»
										«IF map.get(artifact).containsKey(ServiceEnum.ALL)»
											«{listServices.addAll(map.get(artifact).get(ServiceEnum.ALL)); null}»
										«ENDIF»
										«FOR service : listServices»
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