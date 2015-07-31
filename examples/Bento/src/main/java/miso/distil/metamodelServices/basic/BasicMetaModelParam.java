package miso.distil.metamodelServices.basic;

import java.util.ArrayList;
import java.util.List;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractParam;

/**
 * Auto-generated parameters.
 * 
 * @author miso.distil.codeGenerator.
 */
public class BasicMetaModelParam extends BasicAbstractParam {
	// Attributes parameters

	private static List<String> values = new ArrayList<String>();
	/**
	* Auto-generated list with all parameters.
	* 
	* @return list with values.
	*/
	public static List<String> values() {
		if(values.isEmpty()) {
			values.addAll(BasicAbstractParam.values());
		}
		return values;
	}
}
