package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
       public static void main(String []args) throws IOException {
    	   int ch;
    	   FileInputStream fin= new FileInputStream(args[0]);
    	   FileOutputStream oos= new FileOutputStream(args[1]);
    	   while((ch=fin.read())!=-1) {
    		   oos.write(ch);
    	   }
    	   fin.close();
    	   oos.close();
    	   System.out.println("file copied");
       }
}
