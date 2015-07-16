package miso.carrascal.cloudModelServices.abstractServices;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persistent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String objectid;
    private String objectname;
    private Date createdat;
    private Long filesize;
 
    public Persistent() {}
    
    public Persistent(String objectName, Long fileSize) {
        this.objectid = "";
    	this.objectname = objectName.toLowerCase();
    	this.createdat = new Date();
    	this.filesize = fileSize;
    }
       
    public String getObjectid() {
		return objectid;
	}
    
    @Deprecated
    public void setObjectid(String objectId) {
		this.objectid = objectId;
	}
	    
    public String getObjectname() {
		return objectname;
	}
	
	public Date getCreatedat() {
        return createdat;
    }
	
	public String getCreatedatString() {
        DateFormat dateFormat = new SimpleDateFormat(" EEE dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this.createdat);	
    }

	public Long getFilesize() {
		return filesize;
	}

	public void setFilesize(Long fileSize) {
		this.filesize = fileSize;
	}
}