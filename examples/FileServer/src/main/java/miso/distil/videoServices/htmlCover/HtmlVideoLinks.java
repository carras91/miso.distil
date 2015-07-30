package miso.distil.videoServices.htmlCover;

import miso.distil.videoServices.basic.BasicVideoParam;
import miso.distil.videoServices.basic.BasicVideoSpark;
import miso.distil.videoServices.Video;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlVideoLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(Video video) {
		return "<a href=" + BasicVideoSpark.ReadJson + video.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(Video video) {
		return "<a href=" + HtmlVideoSpark.ReadHTML + video.getObjectid() + ">" + video.getFilename() + "</a>";
	}

	/**
	 * Auto-generated link to the service download
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadJsonLink(Video video) {
		return "<a href=" + BasicVideoSpark.DownloadJson + video.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(Video video) {
		String form = "";
		form = "<form id=\"delete" + video.getObjectid() + "\"action=\"" + BasicVideoSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicVideoParam.IdPost + "' value=\"" + video.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + video.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

}
