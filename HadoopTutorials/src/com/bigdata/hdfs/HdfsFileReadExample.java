package com.bigdata.hdfs;

import java.io.IOException;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.conf.Configuration;

public class HdfsFileReadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration conf = new Configuration();
		FileSystem fs = null;
		FSDataInputStream in = null;
		try {
			fs = FileSystem.get(conf);
			Path p1 = new Path("/user/cloudera/HdfsReadInput.txt");
			in = fs.open(p1); 
			IOUtils.copyBytes(in, System.out , 4096);
					
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
		}

	}

}
