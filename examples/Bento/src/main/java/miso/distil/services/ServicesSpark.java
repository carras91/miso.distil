package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.post;
import static spark.Spark.after;

import com.google.gson.JsonSyntaxException;

import miso.carrascal.cloudModelServices.abstractServices.basic.JsonTransformer;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicInterfaceSpark;
import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.RecordDB;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.basic.BasicBentoSpark;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated services spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class ServicesSpark implements BasicInterfaceSpark {

	// URL's
	public static String AnalyseUrl = "/service/analyse/";
	public static String TypeCheckUrl = "/service/typecheck/";
	public static String MetricsUrl = "/service/metrics/";
	public static String SemanticSearchUrl = "/service/semanticsearch/";

	/**
	 * Auto-generated services spark service. It initializes all services url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		ServiceAnalyse serviceAnalyse = new ServiceAnalyse();
		post(AnalyseUrl, "application/json",
			(request, response) -> {
				return serviceAnalyse.runService(request, response, new ArrayList<Persistent>());
			}, new JsonTransformer());


		ServiceTypeCheck serviceTypeCheck = new ServiceTypeCheck();
		post(TypeCheckUrl, "application/json",
			(request, response) -> {
				return serviceTypeCheck.runService(request, response, new ArrayList<Persistent>());
			}, new JsonTransformer());


		ServiceMetrics serviceMetrics = new ServiceMetrics();
		post(MetricsUrl, "application/json",
			(request, response) -> {
				return serviceMetrics.runService(request, response, new ArrayList<Persistent>());
			}, new JsonTransformer());


		ServiceSemanticSearch serviceSemanticSearch = new ServiceSemanticSearch();
		post(SemanticSearchUrl, "application/json",
			(request, response) -> {
				return serviceSemanticSearch.runService(request, response, new ArrayList<Persistent>());
			}, new JsonTransformer());


		after(BasicBentoSpark.UpdateJson, "application/json",
				(request, response) -> {
					String id = request.queryParams(BasicBentoParam.IdPost);
					Bento artifact = RecordDB.getDefault().readOne(id, Bento.class);
					List<Bento> list = new ArrayList<Bento>();
					list.add(artifact);
					String result = "Original response --> " + response.body() + " <-- end of original response. ";
					result = result + " Output from service Analyse --> " + (new JsonTransformer()).render(serviceAnalyse.runService(request, response, list)) + " <-- end of service Analyse. ";
					response.body(result);
				});

		after(BasicBentoSpark.UploadJson, "application/json",
				(request, response) -> {
					try {
						Bento artifact = JsonTransformer.fromJson(response.body(), Bento.class);
						List<Bento> list = new ArrayList<Bento>();
						list.add(artifact);
						String result = "Original response --> " + response.body() + " <-- end of original response. ";
						result = result + " Output from service Analyse --> " + (new JsonTransformer()).render(serviceAnalyse.runService(request, response, list)) + " <-- end of service Analyse. ";
						response.body(result);
					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}
				});
	}
}
