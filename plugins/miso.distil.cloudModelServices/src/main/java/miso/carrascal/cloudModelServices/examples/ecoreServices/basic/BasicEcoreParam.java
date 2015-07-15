package miso.carrascal.cloudModelServices.examples.ecoreServices.basic;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.basic.BasicAbstractParam;

public class BasicEcoreParam extends BasicAbstractParam {

	public static String Summary = "ECORESUMMARY";
	public static String Author = "ECOREAUTHOR";
	public static String Active = "ECOREACTIVE";
	public static String Tags = "TAGS";

	private static List<String> values = new ArrayList<String>();
	public static List<String> values() {
		if(values.isEmpty()) {
			values.addAll(BasicAbstractParam.values());
			values.add(Summary);
			values.add(Author);
			values.add(Active);
			values.add(Tags);
		}
		return values;
	}
}