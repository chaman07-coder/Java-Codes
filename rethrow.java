
package person;
import java.util.*;

public class rethrow {
     void method1() {
    	 try {
    		 String str="Hello";
    		 System.out.println(str.charAt(5));
    	 }
    	 catch(StringIndexOutofBoundsException sie) {
    		 System.out.println("rethrowing exception");
    		 throw sie;
    	 }
     }
}
class b{
	rethrow r=new rethrow();
	try {
		r.method1();
	}
	catch(StringIndexOutofBoundsException sie) {
		System.out.println("catching rethrow exception");
	}
	
}
}
