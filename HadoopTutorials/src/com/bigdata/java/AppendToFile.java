/*
  Append output to file using FileOutputStream
  This example shows how to append byte data to a file using write method of
  Java FileOutputStream object.
*/
 
import java.io.*;
 
public class AppendToFile {
 
  public static void main(String[] args) {
   
    String strFilePath = "C://FileIO//demo.txt";
   
     try
     {
       /*
        * To append output to a file, use
        * FileOutputStream(String file, booean blnAppend) or
        * FileOutputStream(File file, booean blnAppend) constructor.
        *
        * If blnAppend is true, output will be appended to the existing content
        * of the file. If false, file will be overwritten.
        */
       
      FileOutputStream fos = new FileOutputStream(strFilePath, true);
      String strContent = "Append output to a file example";
     
       fos.write(strContent.getBytes());
     
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