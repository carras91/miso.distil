package miso.carrascal.cloudModelServices.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletResponse;

/*
 * Utilities to execute a download
 * 
 * @author Carlos Carrascal
 */
public class DownloadUtils {

	/*
	 * It sets response's content type and header and generate a zip
	 * 
	 * @param res http servlet response
	 * @param IS information to write
	 * @param zipName zip's name (without .zip)
	 * @param fileName file's name inside the zip (with appropiate file extension)
	 * 
	 * @exception IOException internal exception
	 * @exception NullArgumentException some arguments are null
	 */
	public static void downloadZip(HttpServletResponse res, InputStream IS, String zipName, String fileName) throws IOException {
		if(res == null || IS == null || zipName == null || fileName == null) {
			(new NullArgumentException()).printStackTrace();
			return;
		}
		
		res.setContentType("application/octet-stream");
		res.setHeader("Content-Disposition","attachment; filename=" + zipName +".zip");
		downloadZip(IS, res.getOutputStream(), fileName);
	}
	
	/*
	 * It generates a zip (attention: appropiate content and header config needed)
	 * 
	 * @param IS information to write
	 * @param OS place to write 
	 * @param fileName file's name inside the zip (with appropiate file extension)
	 * 
	 * @exception IOException internal exception
	 * @exception NullArgumentException some arguments are null
	 */
	public static void downloadZip(InputStream IS, OutputStream OS, String fileName) throws IOException {
		if(IS == null || OS == null || fileName == null) {
			(new NullArgumentException()).printStackTrace();
			return;
		}
		
	    BufferedInputStream bufferedInputStream = new BufferedInputStream(IS);
		    
	    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OS);
	    ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
	    ZipEntry zipEntry = new ZipEntry(fileName);
        zipOutputStream.putNextEntry(zipEntry);
	        
		byte[] buffer = new byte[1024];
	    int len;
	    while ((len = bufferedInputStream.read(buffer)) > 0)
	    	zipOutputStream.write(buffer,0,len);
		         
	    zipOutputStream.flush();
	    zipOutputStream.close();
	    bufferedInputStream.close();
	}
	
	/*
	 * It sets response's content type and header and generate a file
	 * 
	 * @param res http servlet response
	 * @param IS information to write
	 * @param fileName file's name (with appropiate file extension)
	 * 
	 * @exception IOException internal exception
	 * @exception NullArgumentException some arguments are null
	 */
	public static void downloadFile(HttpServletResponse res, InputStream IS, String fileName) throws IOException {
		if(res == null || IS == null || fileName == null) {
			(new NullArgumentException()).printStackTrace();
			return;
		}
		
		res.setContentType("application/octet-stream");
		res.setHeader("Content-Disposition","attachment; filename=" + fileName);  
		downloadFile(IS, res.getOutputStream());
	}
	
	/*
	 * It generates a file (attention: appropiate content and header config needed)
	 * 
	 * @param IS information to write
	 * @param OS place to write 
	 * @param fileName file's name (with appropiate file extension)
	 * 
	 * @exception IOException internal exception
	 * @exception NullArgumentException some arguments are null
	 */
	public static void downloadFile(InputStream IS, OutputStream OS) throws IOException {
		if(IS == null || OS == null) {
			(new NullArgumentException()).printStackTrace();
			return;
		}
		
        BufferedInputStream bufferedInputStream = new BufferedInputStream(IS);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OS);
            
		byte[] buffer = new byte[1024];
	    int len;
	    while ((len = bufferedInputStream.read(buffer)) > 0)
	    	bufferedOutputStream.write(buffer, 0, len);
	         
	    bufferedOutputStream.flush();
	    bufferedOutputStream.close();
	    bufferedInputStream.close();
	}
}
