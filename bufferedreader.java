package FileHandling;

import java.io.*;

public class bufferedreader {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //file ka name input lega
      System.out.print("enter file name: ");
      
      String fname=br.readLine(); //buffered class method to read the file
      FileInputStream fin= null;
      try {
    	  fin= new FileInputStream(fname);
      }
      catch(FileNotFoundException ex) {
    	  System.out.println("file not found");
      }
      BufferedInputStream bin=new BufferedInputStream(fin);  //attach file input stream to buffer input stream
      System.out.println("file contents: ");
      int ch;
      while((ch=bin.read())!=-1){
    	  System.out.println((char)ch);
      }
      bin.close();
  }
}
