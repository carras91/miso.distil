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

import miso.distil.pictureServices.basic.BasicPictureParam;
import miso.distil.pictureServices.basic.BasicPictureSpark;
import miso.distil.pictureServices.Picture;
import miso.distil.videoServices.basic.BasicVideoParam;
import miso.distil.videoServices.basic.BasicVideoSpark;
import miso.distil.videoServices.Video;
import miso.distil.documentServices.basic.BasicDocumentParam;
import miso.distil.documentServices.basic.BasicDocumentSpark;
import miso.distil.documentServices.Document;

/**
 * Auto-generated services spark server
 * 
 * @author miso.distil.codeGenerator
 */
public final class ServicesSpark implements BasicInterfaceSpark {

	// URL's
	public static String DownloadAuthorUrl = "/service/downloadauthor/";
	public static String SimilarPicturesUrl = "/service/similarpictures/";
	public static String StatisticsPicUrl = "/service/statisticspic/";
	public static String ComparePicturesUrl = "/service/comparepictures/";
	public static String AnalyseUrl = "/service/analyse/";
	public static String StatisticsDocUrl = "/service/statisticsdoc/";
	public static String DownloadAsTxtUrl = "/service/downloadastxt/";

	/**
	 * Auto-generated services spark service. It initializes all services url's
	 * 
	 * @author miso.distil.codeGenerator
	 */
	@Override
	public void runService() {

		ServiceDownloadAuthor serviceDownloadAuthor = new ServiceDownloadAuthor();
		post(DownloadAuthorUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceDownloadAuthor.runService(request, response, list);
			}, new JsonTransformer());

		ServiceSimilarPictures serviceSimilarPictures = new ServiceSimilarPictures();
		post(SimilarPicturesUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceSimilarPictures.runService(request, response, list);
			}, new JsonTransformer());

		ServiceStatisticsPic serviceStatisticsPic = new ServiceStatisticsPic();
		post(StatisticsPicUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceStatisticsPic.runService(request, response, list);
			}, new JsonTransformer());

		ServiceComparePictures serviceComparePictures = new ServiceComparePictures();
		post(ComparePicturesUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceComparePictures.runService(request, response, list);
			}, new JsonTransformer());

		ServiceAnalyse serviceAnalyse = new ServiceAnalyse();
		post(AnalyseUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceAnalyse.runService(request, response, list);
			}, new JsonTransformer());

		ServiceStatisticsDoc serviceStatisticsDoc = new ServiceStatisticsDoc();
		post(StatisticsDocUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceStatisticsDoc.runService(request, response, list);
			}, new JsonTransformer());

		ServiceDownloadAsTxt serviceDownloadAsTxt = new ServiceDownloadAsTxt();
		post(DownloadAsTxtUrl, "application/json",
			(request, response) -> {
				List<Persistent> list = new ArrayList<Persistent>();
				return serviceDownloadAsTxt.runService(request, response, list);
			}, new JsonTransformer());

		after(BasicPictureSpark.DownloadZipIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicPictureParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Picture.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicPictureSpark.DownloadFileIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicPictureParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Picture.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicPictureSpark.UploadJson, "application/json",
				(request, response) -> {
					try {
			            Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), Picture.class));
						List<Persistent> list = new ArrayList<Persistent>();
						list.add(artifact);
						serviceSimilarPictures.runService(request, response, list);
					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}
				});

		after(BasicVideoSpark.DownloadZipIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicVideoParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Video.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicVideoSpark.DownloadFileIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicVideoParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Video.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicDocumentSpark.DownloadZipIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicDocumentParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Document.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicDocumentSpark.DownloadFileIdJson, "application/json",
				(request, response) -> {
					String id = request.params(BasicDocumentParam.IdGet);
					Persistent artifact = RecordDB.getDefault().readOne(id, Document.class);
					List<Persistent> list = new ArrayList<Persistent>();
					list.add(artifact);
					serviceDownloadAuthor.runService(request, response, list);
				});

		after(BasicDocumentSpark.UploadJson, "application/json",
				(request, response) -> {
					try {
			            Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), Document.class));
						List<Persistent> list = new ArrayList<Persistent>();
						list.add(artifact);
						serviceAnalyse.runService(request, response, list);
					} catch (JsonSyntaxException e) {
						e.printStackTrace();
					}
				});
	}
}
