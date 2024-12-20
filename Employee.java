package FileHandling;
import java.io.*;
import java.util.*;
class Employee implements Serializable {
        int id;
        String name;
        float sal;
        Date doj;
        
        Employee(int i, String n, float s, Date d){
        	id=i;
        	name=n;
        	sal=s;
        	doj=d;
        }
        void display() {
        	System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
        }
        static Employee getData() throws IOException{
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("enter employee id: ");
        	int id= Integer.parseInt(br.readLine());
        	
        	System.out.println("enter name: ");
        	String name= br.readLine();
        	
        	System.out.println("enter salary: ");
        	float sal= Float.parseFloat(br.readLine());
        	
        	Date d= new Date();
        	Employee e=new Employee(id,name,sal,d);
        	
        	return e;
        	
        	}
}
class Storeobj{
	public static void main(String []args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fout=new FileOutputStream("objfile");
		ObjectOutputStream obj =new ObjectOutputStream(fout);
		System.out.println("how many objects: ");
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			Employee e1=Employee.getData();
			obj.writeObject(e1);
		}
		obj.close();
	}
}
