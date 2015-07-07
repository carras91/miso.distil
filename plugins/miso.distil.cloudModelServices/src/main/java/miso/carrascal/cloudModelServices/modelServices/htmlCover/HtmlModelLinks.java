package miso.carrascal.cloudModelServices.modelServices.htmlCover;

import miso.carrascal.cloudModelServices.abstractServices.RecordDB;
import miso.carrascal.cloudModelServices.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.ecoreServices.htmlCover.HtmlEcoreLinks;
import miso.carrascal.cloudModelServices.modelServices.Model;
import miso.carrascal.cloudModelServices.modelServices.basic.BasicModelCodes;
import miso.carrascal.cloudModelServices.modelServices.basic.BasicModelParam;
import miso.carrascal.cloudModelServices.modelServices.basic.BasicModelSpark;

public class HtmlModelLinks {
	
	public static String getReadJsonLink(Model model) {
   		return "<a href=" + BasicModelSpark.ReadJSON + model.getObjectId() + ">View as Json</a>";
    }
    
    public static String getDownloadZipJsonLink(Model model) {
   		return "<a href=" + BasicModelSpark.DownloadZipJSON + model.getObjectId() + ">Download zip</a>";
    }
 
    public static String getDownloadFileJsonLink(Model model) {
    	return "<a href=" + BasicModelSpark.DownloadFileJSON + model.getObjectId() + ">Download model</a>";
   	}
    
    public static String getDeleteFormJsonLink(Model model) {
		String form = "";
		form = "<form id=\"delete" + model.getObjectId() + "\"action=\"" + BasicModelSpark.DeleteJSON + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicModelParam.IdPost + "' value=\"" + model.getObjectId() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + model.getObjectId() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}
	
	public static String getReadHtmlLink(Model model) {
		return "<a href=" + HtmlModelSpark.ReadHTML + model.getObjectId() + ">" + model.getObjectName() + "</a>";
	}
	
	public static String getUpdateHtmlLink(Model model) {
   		return "<a href=" + HtmlModelSpark.UpdateFormHTML + model.getObjectId() + ">Update</a>";
    }
	
	public static String getEcoreNameLink(Model model) {
		Ecore ecore = (Ecore) RecordDB.getDefault().readOne(model.getObjectIdEcore(), Ecore.class);
		if(ecore != null) {
			return HtmlEcoreLinks.getReadHtmlLink(ecore);
		} else {
			return BasicModelCodes.DB_ecorenotfound;
		} 
	}
}
