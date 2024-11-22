package person;

public class MyException extends Exception{
	
    static double balls[]= {1000.00, 2000.00, 300.00};
     static String name[]= {"raja rao","rama rao","subha rao"};
    
    MyException(String str){
    	super(str);
    }
    public static void main(String []args) {
    	try {
    		for(int i=0;i<3;i++) {
    			System.out.println(balls[i]+" "+name[i]);
    			if(balls[i]<1000) {
    				MyException me= new MyException("less balls");
    				throw me;
    			}
    		}
    	}
    	catch(MyException me) {
    		System.out.println(me);
    	}
    }
}
