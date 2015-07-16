package miso.distil.services;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.post;
import static spark.Spark.after;

import com.google.gson.Gson;
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
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceAnalyse.runService(request, response, list);
			}, new JsonTransformer());

		ServiceTypeCheck serviceTypeCheck = new ServiceTypeCheck();
		post(TypeCheckUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceTypeCheck.runService(request, response, list);
			}, new JsonTransformer());

		ServiceMetrics serviceMetrics = new ServiceMetrics();
		post(MetricsUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceMetrics.runService(request, response, list);
			}, new JsonTransformer());

		ServiceSemanticSearch serviceSemanticSearch = new ServiceSemanticSearch();
		post(SemanticSearchUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceSemanticSearch.runService(request, response, list);
			}, new JsonTransformer());

		after(BasicBentoSpark.UpdateJson, "application/json",
				(request, response) -> {
					String id = request.queryParams(BasicBentoParam.IdPost);
					Persistent artifact = RecordDB.getDefault().readOne(id, Bento.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceAnalyse.runService(request, response, list);
				});

		after(BasicBentoSpark.UploadJson, "application/json",
				(request, response) -> {
					try {
			            Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), Bento.class));
						List<Persistent> list = new ArrayList<Persistent>();
						list.add(artifact);
						serviceAnalyse.runService(request, response, list);
					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}
				});
	}
}
