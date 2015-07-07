package miso.carrascal.cloudModelServices.ecoreServices.htmlCover;

import miso.carrascal.cloudModelServices.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.ecoreServices.basic.BasicEcoreParam;
import miso.carrascal.cloudModelServices.ecoreServices.basic.BasicEcoreSpark;

public class HtmlEcoreLinks {
	
	public static String getReadJsonLink(Ecore ecore) {
   		return "<a href=" + BasicEcoreSpark.ReadJSON + ecore.getObjectId() + ">View as Json</a>";
    }
    
    public static String getDownloadZipJsonLink(Ecore ecore) {
   		return "<a href=" + BasicEcoreSpark.DownloadZipJSON + ecore.getObjectId() + ">Download zip</a>";
    }
 
    public static String getDownloadFileJsonLink(Ecore ecore) {
    	return "<a href=" + BasicEcoreSpark.DownloadFileJSON + ecore.getObjectId() + ">Download ecore</a>";
   	}
    
    public static String getDeleteFormJsonLink(Ecore ecore) {
		String form = "";
		form = "<form id=\"delete" + ecore.getObjectId() + "\"action=\"" + BasicEcoreSpark.DeleteJSON + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicEcoreParam.IdPost + "' value=\"" + ecore.getObjectId() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + ecore.getObjectId() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}
	
	public static String getReadHtmlLink(Ecore ecore) {
		return "<a href=" + HtmlEcoreSpark.ReadHTML + ecore.getObjectId() + ">" + ecore.getObjectName() + "</a>";
	}
	
	public static String getUpdateHtmlLink(Ecore ecore) {
   		return "<a href=" + HtmlEcoreSpark.UpdateFormHTML + ecore.getObjectId() + ">Update</a>";
    }
}
