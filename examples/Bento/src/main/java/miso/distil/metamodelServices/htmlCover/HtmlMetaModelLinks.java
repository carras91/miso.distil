package miso.distil.metamodelServices.htmlCover;

import miso.distil.metamodelServices.basic.BasicMetaModelParam;
import miso.distil.metamodelServices.basic.BasicMetaModelSpark;
import miso.distil.metamodelServices.MetaModel;

/**
 * Auto-generated html links.
 * 
 * @author miso.distil.codeGenerator.
 */
public class HtmlMetaModelLinks {

	/**
	 * Auto-generated link to the service download.
	 * 
	 * @param metamodel MetaModel to create the link.
	 * @return the link.
	 */
	public static String getDownloadJsonLink(MetaModel metamodel) {
		return "<a href=" + BasicMetaModelSpark.DownloadJson + metamodel.getObjectid() + ">Download</a>";
	}

	/**
	 * Auto-generated link to the service delete.
	 * 
	 * @param metamodel MetaModel to create the link.
	 * @return the link (form type post link).
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
