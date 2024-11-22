package classesandobj.java;

interface tax{
	double statetax();
}
class AP implements tax{
	public double statetax() {
		System.out.println("AP under govt. rules");
		return 5000.0;
	}
}
class karnataka implements tax{
	public double statetax() {
		System.out.println("karnatakja");
		return 2000;
	}
}
public class interfacecode {
            public static void main(String []args) {
            	tax a=new AP();
            	calculatetax(a);  //AP reference is passed
            	
            	tax b=new karnataka();
            	calculatetax(b);
            }
            static void calculatetax(tax a) {
            	double ct=1000.0;
            	double st= a.statetax();
            	System.out.println("total tax= "+ (ct+st));
            }	
}
