package miso.distil.atltrafoServices.htmlCover;

import miso.distil.atltrafoServices.basic.BasicATLTrafoParam;
import miso.distil.atltrafoServices.basic.BasicATLTrafoSpark;
import miso.distil.atltrafoServices.ATLTrafo;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlATLTrafoLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(ATLTrafo atltrafo) {
		return "<a href=" + BasicATLTrafoSpark.ReadJson + atltrafo.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(ATLTrafo atltrafo) {
		return "<a href=" + HtmlATLTrafoSpark.ReadHTML + atltrafo.getObjectid() + ">" + atltrafo.getObjectname() + "</a>";
	}

	/**
	 * Auto-generated link to the service download zip
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadZipJsonLink(ATLTrafo atltrafo) {
		return "<a href=" + BasicATLTrafoSpark.DownloadZipJson + atltrafo.getObjectid() + ">Download zip</a>";
	}

	/**
	 * Auto-generated link to the service download file
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadFileJsonLink(ATLTrafo atltrafo) {
		return "<a href=" + BasicATLTrafoSpark.DownloadFileJson + atltrafo.getObjectid() + ">Download atltrafo</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(ATLTrafo atltrafo) {
		String form = "";
		form = "<form id=\"delete" + atltrafo.getObjectid() + "\"action=\"" + BasicATLTrafoSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicATLTrafoParam.IdPost + "' value=\"" + atltrafo.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + atltrafo.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

}
