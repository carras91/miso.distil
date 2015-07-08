package miso.carrascal.cloudModelServices.examples.modelServices.filter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class FilterModelInfo {
	

    private LinkedHashMap<String, List<List<String>>> modelInfo = new LinkedHashMap<String, List<List<String>>>();

	public void merge(FilterModelInfo newInfo) {
		for(Entry<String, List<List<String>>> entry : newInfo.getModelInfo().entrySet()) {
			if(modelInfo.containsKey(entry.getKey())) {
				for(List<String> list : modelInfo.get(entry.getKey())) {
					list.addAll(entry.getValue().get(modelInfo.get(entry.getKey()).indexOf(list)));
				}
			} else {
				modelInfo.put(entry.getKey(), entry.getValue());
			}
		}
	}

	public LinkedHashMap<String, List<List<String>>> getModelInfo() {
		return modelInfo;
	}

	public void setModelInfo(LinkedHashMap<String, List<List<String>>> modelInfo) {
		this.modelInfo = modelInfo;
	}
	
	public List<String> getClassName() {
		List<String> list = new ArrayList<String>();
		for(String name : modelInfo.keySet()) {
			list.add(name.substring(name.indexOf(":")+1));
		}
		return list;		
	}
	
}
