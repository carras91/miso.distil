package miso.distil.pictureServices.htmlCover;

import miso.distil.pictureServices.basic.BasicPictureParam;
import miso.distil.pictureServices.basic.BasicPictureSpark;
import miso.distil.pictureServices.Picture;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlPictureLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(Picture picture) {
		return "<a href=" + BasicPictureSpark.ReadJson + picture.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(Picture picture) {
		return "<a href=" + HtmlPictureSpark.ReadHTML + picture.getObjectid() + ">" + picture.getFilename() + "</a>";
	}

	/**
	 * Auto-generated link to the service download
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadJsonLink(Picture picture) {
		return "<a href=" + BasicPictureSpark.DownloadJson + picture.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(Picture picture) {
		String form = "";
		form = "<form id=\"delete" + picture.getObjectid() + "\"action=\"" + BasicPictureSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicPictureParam.IdPost + "' value=\"" + picture.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + picture.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

}
