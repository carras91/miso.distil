package miso.distil.metamodelServices.htmlCover;

import miso.distil.metamodelServices.basic.BasicMetaModelParam;
import miso.distil.metamodelServices.basic.BasicMetaModelSpark;
import miso.distil.metamodelServices.MetaModel;

/**
 * Auto-generated html links
 * 
 * @author miso.distil.codeGenerator
 */
public class HtmlMetaModelLinks {

	/**
	 * Auto-generated link to the service read one json
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadJsonLink(MetaModel metamodel) {
		return "<a href=" + BasicMetaModelSpark.ReadJson + metamodel.getObjectid() + ">View as Json</a>";
	}

	/**
	 * Auto-generated link to the service read one html
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getReadHtmlLink(MetaModel metamodel) {
		return "<a href=" + HtmlMetaModelSpark.ReadHTML + metamodel.getObjectid() + ">" + metamodel.getObjectname() + "</a>";
	}

	/**
	 * Auto-generated link to the service download zip
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadZipJsonLink(MetaModel metamodel) {
		return "<a href=" + BasicMetaModelSpark.DownloadZipJson + metamodel.getObjectid() + ">Download zip</a>";
	}

	/**
	 * Auto-generated link to the service download file
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDownloadFileJsonLink(MetaModel metamodel) {
		return "<a href=" + BasicMetaModelSpark.DownloadFileJson + metamodel.getObjectid() + ">Download metamodel</a>";
	}

	/**
	 * Auto-generated link to the service delete
	 * 
	 * @author miso.distil.codeGenerator
	 */
	public static String getDeleteFormJsonLink(MetaModel metamodel) {
		String form = "";
		form = "<form id=\"delete" + metamodel.getObjectid() + "\"action=\"" + BasicMetaModelSpark.DeleteJson + "\" method=\"POST\">";
		form += "<input type='hidden' name='" + BasicMetaModelParam.IdPost + "' value=\"" + metamodel.getObjectid() + "\"/>";
		form += "<a href=\"javascript:{}\" onclick=\"document.getElementById('delete" + metamodel.getObjectid() + "').submit(); return false;\">Delete</a>";
		form += "</form>";
	    return form;
	}

}
