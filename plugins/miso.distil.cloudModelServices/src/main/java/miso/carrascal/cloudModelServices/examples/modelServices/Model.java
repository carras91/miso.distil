package miso.carrascal.cloudModelServices.examples.modelServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miso.carrascal.cloudModelServices.abstractServices.Persistent;
import miso.carrascal.cloudModelServices.abstractServices.filter.EType;
import miso.carrascal.cloudModelServices.examples.modelServices.filter.FilterModelInfo;
import miso.carrascal.cloudModelServices.utils.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
 
public class Model extends Persistent {
	
	private static final long serialVersionUID = 1L;
	private String objectIdEcore;
	private String author;   
    private String summary;
    private FilterModelInfo filterInfo;
    private HashMap<EType, Boolean> filters;
    private List<String> tags;
    
    public Model() {
    	super();
    }
    
    public Model(String objectIdEcore, String name, long fileSize, String summary, List<String> tags,
    		String author, FilterModelInfo filterInfo, HashMap<EType, Boolean> filters) {
    	
    	super(name, fileSize);
    	
    	this.objectIdEcore = objectIdEcore;
        this.author = author;
        this.summary = summary;
        this.filterInfo = filterInfo;
        this.filters = filters;
    	List<String> lowerTags = new ArrayList<String>();
    	for(String tag : tags)
    		lowerTags.add(tag.toLowerCase());
        this.tags = lowerTags;
    }

	public String getObjectIdEcore() {
		return objectIdEcore;
	}

	public void setObjectIdEcore(String objectIdEcore) {
		this.objectIdEcore = objectIdEcore;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public FilterModelInfo getFilterInfo() {
		return filterInfo;
	}

	public void setFilterInfo(FilterModelInfo filterInfo) {
		this.filterInfo = filterInfo;
	}
	
	public String getFilterInfoJson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return Utils.escapeHTML(gson.toJson(filterInfo));
	}

	public HashMap<EType, Boolean> getFilters() {
		return filters;
	}

	public void setFilters(HashMap<EType, Boolean> filters) {
		this.filters = filters;
	}

	public List<String> getTags() {
		return new ArrayList<String>(tags);
	}
	
	public String getTagsString() {
		return  Utils.ListToString(this.getTags());
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}