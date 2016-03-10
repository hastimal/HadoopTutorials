/*
  Write file using FileOutputStream
  This example shows how to write byte data to a file using write method of
  Java FileOutputStream object.
*/
 
import java.io.*;
 
public class WriteFile {
 
  public static void main(String[] args) {
   
    String strFilePath = "C://FileIO//demo.txt";
   
     try
     {
      FileOutputStream fos = new FileOutputStream(strFilePath);
      byte b = 01;
     
      /*
       * To write byte data to a file, use
       * void write(int i) method of Java FileOutputStream class.
       *
       * This method writes given byte to a file.
       */
     
       fos.write(b);
     
      /*
       * Close FileOutputStream using,
       * void close() method of Java FileOutputStream class.
       *
       */
     
       fos.close();
     
     }
     catch(FileNotFoundException ex)
     {
      System.out.println("FileNotFoundException : " + ex);
     }
     catch(IOException ioe)
     {
      System.out.println("IOException : " + ioe);
     }
   
  }
}