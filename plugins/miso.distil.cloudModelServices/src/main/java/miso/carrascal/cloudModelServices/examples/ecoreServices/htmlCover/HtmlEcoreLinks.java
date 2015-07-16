package miso.carrascal.cloudModelServices.examples.ecoreServices.htmlCover;

import miso.carrascal.cloudModelServices.examples.ecoreServices.Ecore;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreParam;
import miso.carrascal.cloudModelServices.examples.ecoreServices.basic.BasicEcoreSpark;

public class HtmlEcoreLinks {
	
	public static String getReadJsonLink(Ecore ecore) {
   		return "<a href=" + BasicEcoreSpark.ReadJSON + ecore.getObjectid() + ">View as Json</a>";
    }
    
    public static String getDownloadZipJsonLink(Ecore ecore) {
   		return "<a href=" + BasicEcoreSpark.DownloadZipJSON + ecore.getObjectid() + ">Download zip</a>";
    }
 
    public static String getDownloadFileJsonLink(Ecore ecore) {
    	return "<a href=" + BasicEcoreSpark.DownloadFileJSON + ecore.getObjectid() + ">Download ecore</a>";
   	}
    
    public static String getDeleteFormJsonLink(Ecore ecore) {
		String form = "";
		form = "<form id=\"delete" + ecore.getObjectid() + "\"action=\"" + BasicEcoreSpark.DeleteJSON + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicEcoreParam.IdPost + "' value=\"" + ecore.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + ecore.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}
	
	public static String getReadHtmlLink(Ecore ecore) {
		return "<a href=" + HtmlEcoreSpark.ReadHTML + ecore.getObjectid() + ">" + ecore.getObjectname() + "</a>";
	}
	
	public static String getUpdateHtmlLink(Ecore ecore) {
   		return "<a href=" + HtmlEcoreSpark.UpdateFormHTML + ecore.getObjectid() + ">Update</a>";
    }
}
