package com.bigdata.hdfs;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

// Examples for Both FileCreation and copyFromLocal/Put command 

public class HdfsFileWriteExample {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//String textToWrite = "Hello HDFS! Elephants are awesome!\n";
		//InputStream in = new BufferedInputStream(new ByteArrayInputStream(textToWrite.getBytes()));
		
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("/home/cloudera/flume.conf"));
		
		//Path toHdfs = new Path("/user/cloudera/writeMe.txt");
		Path outPath = new Path(args[0]);
		Configuration conf = new Configuration();

		FileSystem fs;
		try {
			fs = FileSystem.get(conf);
			
			FSDataOutputStream out = fs.create(outPath);
			IOUtils.copyBytes(br, out, conf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		   IOUtils.closeStream(br);
		   
		}
				
	}

}
