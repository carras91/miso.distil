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
	 * Auto-generated link to the service download
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadJsonLink(ATLTrafo atltrafo) {
		return "<a href=" + BasicATLTrafoSpark.DownloadJson + atltrafo.getObjectid() + ">Download</a>";
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
