package miso.distil.bentoServices.htmlCover;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.basic.BasicBentoSpark;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlBentoLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(Bento bento) {
		return "<a href=" + BasicBentoSpark.ReadJson + bento.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(Bento bento) {
		return "<a href=" + HtmlBentoSpark.ReadHTML + bento.getObjectid() + ">" + bento.getObjectname() + "</a>";
	}

	/**
	 * Auto-generated link to the service download zip
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadZipJsonLink(Bento bento) {
		return "<a href=" + BasicBentoSpark.DownloadZipJson + bento.getObjectid() + ">Download zip</a>";
	}

	/**
	 * Auto-generated link to the service download file
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadFileJsonLink(Bento bento) {
		return "<a href=" + BasicBentoSpark.DownloadFileJson + bento.getObjectid() + ">Download bento</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(Bento bento) {
		String form = "";
		form = "<form id=\"delete" + bento.getObjectid() + "\"action=\"" + BasicBentoSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicBentoParam.IdPost + "' value=\"" + bento.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + bento.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

	/**
	 * Auto-generated link to the service update form html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getUpdateHtmlLink(Bento bento) {
		return "<a href=" + HtmlBentoSpark.UpdateFormHTML + bento.getObjectid() + ">Update</a>";
	}
}
