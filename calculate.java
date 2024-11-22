package classesandobj.java;

public class interface1 {
     public static void main(String args[]) {
    	 try {
    	 System.out.println("open files");
    	 int n = 2;
    	 System.out.println("n= "+n);
    	 int a = 45/n;
    	 System.out.println("a="+ a);
    	 try {
    	 int b[]= {10,20,30};
    	 b[50]= 54; 
    	 System.out.println("close files");
    	 }
     }
    	 catch(ArithmeticException ae){
    		 System.out.println(ae);
    		 //ae.printStackTrace();
    		 System.out.println("pass data while runnoing");
    	 }
    	 catch(ArrayIndexOutofBoundsException aie) {
    		 System.out.println(aie);
    	 }
    	 finally {
    		 System.out.println("close files");
    	 }
}
}