package com.concurrentDownload;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadRunnable implements Runnable{
	
	private String source;
	
	private String target;
	

	public void run() {
	
		try {
			downloadResource(source,target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void downloadResource(String source,String target) throws IOException{
		
		String fileName = "OldFileDownload.txt"; //The file that will be saved on your computer
		 URL link = new URL("http://shayconcepts.com"); //The file that you want to download
			
	     //Code to download
			 InputStream in = null;
			try {
				in = new BufferedInputStream(link.openStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 ByteArrayOutputStream out = new ByteArrayOutputStream();
			 byte[] buf = new byte[1024];
			 int n = 0;
			 try {
				while (-1!=(n=in.read(buf)))
				 {
				    out.write(buf, 0, n);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 byte[] response = out.toByteArray();
	 
			 FileOutputStream fos = new FileOutputStream(fileName);
			 fos.write(response);
			 fos.close();
	     //End download code
			 
			 System.out.println("Finished");
		
		
	}

}
