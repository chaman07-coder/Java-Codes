package FileHandling;
import java.io.*;
import java.util.*;

public class serialization{
	public static void main(String []args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fout=new FileOutputStream("objfile");
		ObjectOutputStream obj=new ObjectOutputStream(fout);
		
		System.out.println("how many objects: ");
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			serialization e1=serialization.getData();
			obj.writeObject(e1);
			
		}
		oos.close();
	}
}

