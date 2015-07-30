package miso.distil.modelServices.htmlCover;

import miso.distil.modelServices.basic.BasicModelParam;
import miso.distil.modelServices.basic.BasicModelSpark;
import miso.distil.modelServices.Model;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlModelLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(Model model) {
		return "<a href=" + BasicModelSpark.ReadJson + model.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(Model model) {
		return "<a href=" + HtmlModelSpark.ReadHTML + model.getObjectid() + ">" + model.getFilename() + "</a>";
	}

	/**
	 * Auto-generated link to the service download
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadJsonLink(Model model) {
		return "<a href=" + BasicModelSpark.DownloadJson + model.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(Model model) {
		String form = "";
		form = "<form id=\"delete" + model.getObjectid() + "\"action=\"" + BasicModelSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicModelParam.IdPost + "' value=\"" + model.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + model.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

	/**
	 * Auto-generated link to the service update form html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getUpdateHtmlLink(Model model) {
		return "<a href=" + HtmlModelSpark.UpdateFormHTML + model.getObjectid() + ">Update</a>";
	}
}
