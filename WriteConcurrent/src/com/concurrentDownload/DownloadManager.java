package com.concurrentDownload;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class DownloadManager {
	
	private static DownloadManager instance = new DownloadManager();
	
	DownloadRunnable downloadRunnable = new DownloadRunnable();
	
	private DownloadThreadPool downloadThreadPool;

	public static DownloadManager getInstance(){
		if(null==instance){
			instance = new DownloadManager();
		}
		return instance;
	}


	private DownloadManager()  {

			downloadThreadPool = new DownloadThreadPool(2);
			
			//for(int i=0;i<5;i++){
			Future future = downloadThreadPool.submit(new DownloadRunnable());
			Future future1 = downloadThreadPool.submit(new Runnable() {
				
				@Override
				public void run() {
					String fileName = "fileDownload32133.txt"; //The file that will be saved on your computer
					 URL link = null;
					try {
						link = new URL("http://dev.wavemaker.com/");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} //The file that you want to download
						
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
				 
						 FileOutputStream fos = null;
						try {
							fos = new FileOutputStream(fileName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 try {
							fos.write(response);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 try {
							fos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				     //End download code
						 
						 System.out.println("Finished");
					
				}
			});
//			try {
//				future1.get();
//			//	future.get();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("NUMBER OF TASKS Completed ARE-------"+downloadThreadPool.getTaskCount());
		//	}
			//downloadThreadPool.getQueue().size();

			
		}
		
		//return instance;
	}
	
	
	
	
	
	
	


