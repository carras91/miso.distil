package miso.carrascal.cloudModelServices.abstractServices;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persistent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String objectId;
    private String objectName;
    private Date createdAt;
    private Long fileSize;
 
    public Persistent() {}
    
    public Persistent(String objectName, Long fileSize) {
        this.objectId = "";
    	this.objectName = objectName;
    	this.createdAt = new Date();
    	this.fileSize = fileSize;
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
}