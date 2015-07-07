package miso.carrascal.cloudModelServices.abstractServices;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import miso.carrascal.cloudModelServices.utils.Utils;

public abstract class AbstractPersistentClass implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String objectId;
    private String objectName;
    private Date createdAt;
    private Long fileSize;
    private List<String> tags;
 
    public AbstractPersistentClass() {}
    
    public AbstractPersistentClass(String objectName, Long fileSize, List<String> tags) {
        this.objectId = "";
    	this.objectName = objectName;
    	this.createdAt = new Date();
    	this.fileSize = fileSize;
    	List<String> lowerTags = new ArrayList<String>();
    	for(String tag : tags)
    		lowerTags.add(tag.toLowerCase());
        this.tags = lowerTags;
    }
       
    public String getObjectId() {
		return objectId;
	}
    
    @Deprecated
    public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	    
    public String getObjectName() {
		return objectName;
	}
	
	public Date getCreatedAt() {
        return createdAt;
    }
	
	public String getCreatedAtString() {
        DateFormat dateFormat = new SimpleDateFormat(" EEE dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this.createdAt);	
    }

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
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