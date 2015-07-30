package miso.carrascal.cloudModelServices.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import spark.Response;

/**
 * Utility to add files to a response to be downloaded when response returned to user.
 * If one file, download the file. If multiple, download a zip.
 * 
 * @author Carlos Carrascal
 */
public class RecordDownload {
	
	/**
	 * HashMap to store the files (inputstream and filename) associated with a response
	 */
	private static HashMap<Response, List<Pair<InputStream, String>>> download = new HashMap<Response, List<Pair<InputStream, String>>>();
	/**
	 * ZIP name
	 */
	private static String zipName = "Foo.zip";

	/**
	 * Method to add to a java spark Response a file to be downloaded.
	 * It does nothing if NullPointerException().
	 * 
	 * @param res Response to be used
	 * @param IS Information to be add
	 * @param fileName Name of the file
	 */
	public static void addDownload(Response res, InputStream IS, String fileName) {
		if(res == null || IS == null || fileName == null) {
			(new NullPointerException()).printStackTrace();
			return;
		}
		
		if(download.containsKey(res)) {
			download.get(res).add(new Pair<InputStream, String>(IS, fileName));
		} else {
			List<Pair<InputStream, String>> list = new ArrayList<Pair<InputStream, String>>();
			list.add(new Pair<InputStream, String>(IS, fileName));
			download.put(res, list);
		}
	}
	
	/**
	 * Method to finish a download for a response. If some files are associated, the will be packed (zip) and downloaded.
	 * It does nothing if NullPointerException().
	 * 
	 * @param res Response to be used
	 * @throws IOException Internal exception.
	 */
	public static void closeDownload(Response res) throws IOException {
		if(res == null) {
			(new NullPointerException()).printStackTrace();
			return;
		}
		
		try {
			if(download.containsKey(res)) {

				res.raw().setContentType("application/octet-stream");
				
				List<Pair<InputStream, String>> list = download.get(res);
				if(list.size() > 1) {
					res.raw().setHeader("Content-Disposition","attachment; filename=" + zipName);
					downloadZip(res.raw().getOutputStream() , list);
				} else if(list.size() == 1) {
					res.raw().setHeader("Content-Disposition","attachment; filename=" + list.get(0).getValue());
					downloadFile(res.raw().getOutputStream(), list.get(0).getKey());
				}

				download.remove(res);
			}
			
		
		} catch(IOException e) {
			e.printStackTrace();
			return;
		}
		
		return;
	}
	
	/**
	 * It generates a zip.
	 * It does nothing if NullPointerException().
	 * 
	 * @param OS Place to write.
	 * @param list Pairs with files (InputStream, FileName) to be downloaded
	 * 
	 * @exception IOException Internal exception.
	 */
	private static void downloadZip(OutputStream OS, List<Pair<InputStream, String>> list) throws IOException {
		if(OS == null || list == null) {
			(new NullPointerException()).printStackTrace();
			return;
		}
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OS);
	    ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
	    
	    for(Pair<InputStream, String> pair : list) {
	    	BufferedInputStream bufferedInputStream = new BufferedInputStream(pair.getKey());
	    	ZipEntry zipEntry = new ZipEntry(pair.getValue());
	        zipOutputStream.putNextEntry(zipEntry);
	        
	        byte[] buffer = new byte[1024];
		    int len;
		    while ((len = bufferedInputStream.read(buffer)) > 0)
		    	zipOutputStream.write(buffer,0,len);

		    bufferedInputStream.close();
	    }
		         
	    zipOutputStream.flush();
	    zipOutputStream.close();
	}
	
	/**
	 * It generates a file.
	 * It does nothing if NullPointerException().
	 * 
	 * @param OS Place to write.
	 * @param IS Information to write.
	 * 
	 * @exception IOException Internal exception.
	 */
	private static void downloadFile(OutputStream OS, InputStream IS) throws IOException {
		if(IS == null || OS == null) {
			(new NullPointerException()).printStackTrace();
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
