package miso.carrascal.cloudModelServices.examples.modelServices.basic;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractParam;

public class BasicModelParam extends BasicAbstractParam {

	public static String EcoreId = "ECOREID";
	public static String Summary = "MODELSUMMARY";
	public static String Author = "MODELAUTHOR";

	private static List<String> values = new ArrayList<String>();
	public static List<String> values() {
		if(values.isEmpty()) {
			values.addAll(BasicAbstractParam.values());
			values.add(EcoreId);
			values.add(Summary);
			values.add(Author);
		}
		return values;
	}
}