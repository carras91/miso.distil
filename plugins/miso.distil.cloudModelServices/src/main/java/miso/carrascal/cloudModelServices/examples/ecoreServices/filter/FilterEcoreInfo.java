package miso.carrascal.cloudModelServices.examples.ecoreServices.filter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class FilterEcoreInfo {
	
	private LinkedHashMap<String, List<String>> ecoreInfo = new LinkedHashMap<String, List<String>>();

	public void merge(FilterEcoreInfo newInfo) {
		for(Entry<String, List<String>> entry : newInfo.getEcoreInfo().entrySet()) {
			if(ecoreInfo.containsKey(entry.getKey())) {
				ecoreInfo.get(entry.getKey()).addAll(entry.getValue());
			} else {
				ecoreInfo.put(entry.getKey(), entry.getValue());
			}
		}
	}

	public LinkedHashMap<String, List<String>> getEcoreInfo() {
		return ecoreInfo;
	}

	public void setEcoreInfo(LinkedHashMap<String, List<String>> ecoreInfo) {
		this.ecoreInfo = ecoreInfo;
	}
	
	public List<String> getClassName() {
		List<String> list = new ArrayList<String>();
		for(String name : ecoreInfo.keySet()) {
			list.add(name.substring(name.indexOf(":")+1));
		}
		return list;		
	}
}
