package miso.distil.documentServices.htmlCover;

import miso.distil.documentServices.basic.BasicDocumentParam;
import miso.distil.documentServices.basic.BasicDocumentSpark;
import miso.distil.documentServices.Document;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlDocumentLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(Document document) {
		return "<a href=" + BasicDocumentSpark.ReadJson + document.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(Document document) {
		return "<a href=" + HtmlDocumentSpark.ReadHTML + document.getObjectid() + ">" + document.getFilename() + "</a>";
	}

	/**
	 * Auto-generated link to the service download
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadJsonLink(Document document) {
		return "<a href=" + BasicDocumentSpark.DownloadJson + document.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(Document document) {
		String form = "";
		form = "<form id=\"delete" + document.getObjectid() + "\"action=\"" + BasicDocumentSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicDocumentParam.IdPost + "' value=\"" + document.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + document.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

	/**
	 * Auto-generated link to the service update form html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getUpdateHtmlLink(Document document) {
		return "<a href=" + HtmlDocumentSpark.UpdateFormHTML + document.getObjectid() + ">Update</a>";
	}
}
