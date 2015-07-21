package miso.carrascal.cloudModelServices.abstractServices;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Artifact class. To be stored.
 * 
 * @author Carlos Carrascal
 */
public abstract class Persistent implements Serializable {
	
	/**
	 * To be serialized
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Object identifier
	 */
	private String objectid;
    /**
     * Associated file name
     */
    private String filename;
    /**
     * Creation date
     */
    private Date createdat;
    /**
     * Associated file size
     */
    private Long filesize;
 
    /**
     * Empty constructor
     */
    public Persistent() {}
    
    /**
     * Constructor.
     * 
     * @param filename Associated file name.
     * @param fileSize Associate file size.
     */
    public Persistent(String filename, Long fileSize) {
        this.objectid = "";
    	this.filename = filename.toLowerCase();
    	this.createdat = new Date();
    	this.filesize = fileSize;
    }
       
    /**
     * Get object identifier.
     * 
     * @return Object identifier.
     */
    public String getObjectid() {
		return objectid;
	}
    
    /**
     * Set object identifier. Not to be used. Really. Don't use it.
     * 
     * @param objectId Object identifier.
     */
    @Deprecated
    public void setObjectid(String objectId) {
		this.objectid = objectId;
	}
	    
    /**
     * Get associated file name.
     * 
     * @return Associated file name.
     */
    public String getFilename() {
		return filename;
	}
	
	/**
	 * Get creation date.
	 * 
	 * @return Creation date.
	 */
	public Date getCreatedat() {
        return createdat;
    }
	
	/**
	 * Get string with creation date: " EEE dd/MM/yyyy HH:mm:ss"
	 * 
	 * @return Creation date.
	 */
	public String getCreatedatString() {
        DateFormat dateFormat = new SimpleDateFormat(" EEE dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(this.createdat);	
    }

	/**
	 * Get associated file size.
	 * 
	 * @return Associated file size.
	 */
	public Long getFilesize() {
		return filesize;
	}

	/**
	 * Set associated file size.
	 * 
	 * @param fileSize New associated file size.
	 */
	public void setFilesize(Long fileSize) {
		this.filesize = fileSize;
	}
}