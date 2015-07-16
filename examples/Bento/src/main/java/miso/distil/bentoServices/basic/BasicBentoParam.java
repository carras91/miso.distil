package miso.distil.bentoServices.basic;

import java.util.ArrayList;
import java.util.List;
import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractParam;

/**
 * Auto-generated parameters
 * 
 * @author miso.distil.codeGenerator
 */
public class BasicBentoParam extends BasicAbstractParam {
	// Attributes parameters

	// List with all parameters
	private static List<String> values = new ArrayList<String>();
	/**
	* Auto-generated list with all parameters
	* 
	* @author miso.distil.codeGenerator
	*/
	public static List<String> values() {
		if(values.isEmpty()) {
			values.addAll(BasicAbstractParam.values());
		}
		return values;
	}
}
