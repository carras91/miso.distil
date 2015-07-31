package miso.distil.bentoServices.htmlCover;

import miso.distil.bentoServices.basic.BasicBentoParam;
import miso.distil.bentoServices.basic.BasicBentoSpark;
import miso.distil.bentoServices.Bento;

/**
 * Auto-generated html links.
 * 
 * @author miso.distil.codeGenerator.
 */
public class HtmlBentoLinks {

	/**
	 * Auto-generated link to the service read one json.
	 * 
	 * @param bento Bento to create the link.
	 * @return the link.
	 */
	public static String getReadJsonLink(Bento bento) {
		return "<a href=" + BasicBentoSpark.ReadJson + bento.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html.
	 * 
	 * @param bento Bento to create the link.
	 * @return the link.
	 */
	public static String getReadHtmlLink(Bento bento) {
		return "<a href=" + HtmlBentoSpark.ReadHTML + bento.getObjectid() + ">" + bento.getFilename() + "</a>";
	}

	/**
	 * Auto-generated link to the service download.
	 * 
	 * @param bento Bento to create the link.
	 * @return the link.
	 */
	public static String getDownloadJsonLink(Bento bento) {
		return "<a href=" + BasicBentoSpark.DownloadJson + bento.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete.
	 * 
	 * @param bento Bento to create the link.
	 * @return the link (form type post link).
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
	 * Auto-generated link to the service update form html.
	 * 
	 * @param bento Bento to create the link.
	 * @return the link.
	 */
	public static String getUpdateHtmlLink(Bento bento) {
		return "<a href=" + HtmlBentoSpark.UpdateFormHTML + bento.getObjectid() + ">Update</a>";
	}
}
