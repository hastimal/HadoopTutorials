package com.bigdata.hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;


public class HdfsCopyFromLocalFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		FileSystem fs = null;
		
		FSDataInputStream in = null;
		FSDataOutputStream out = null; 
		
		Path inPath = new Path(args[0]);
		Path outPath = new Path(args[1]);
		
		try {
			fs = FileSystem.get(conf);
			
			in = fs.open(inPath);
			out = fs.create(outPath);
			
			IOUtils.copyBytes(in, out , 4096);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally
		{
			if (in != null)
			{
			IOUtils.closeStream(in);
			}
			if (out != null)
			{
			IOUtils.closeStream(out);
			}
		}
	}

}
