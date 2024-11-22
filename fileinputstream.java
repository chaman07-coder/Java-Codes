package FileHandling;
import java.io.*;

public class fileinputstream {
         public static void main(String[]args) throws IOException{
        	 DataInputStream dis=new DataInputStream(System.in);
        	 FileOutputStream fout=new FileOutputStream("love.txt");
        	 char c;
        	 while((c=(char)dis.read())!='@') {
        		 fout.write(c);
        	 }
        	 fout.close();
        	 
        	 FileInputStream fis=new FileInputStream("love.txt");
        	 int ch;
        	 while((ch=fis.read())!=-1) {
        		 System.out.println((char)ch);
        	 }
        	 fis.close();
        	 
         }
}
