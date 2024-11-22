package classesandobj.java;

class shape{
	int i;
	shape(int i) {
		this.i=i;
	}
}
class square extends shape{
	square(int i){
		super(i);
	}
	void area() {
		System.out.println("area is= "+ i*i);
	}
}
class rectangle extends square{
	int y;
	rectangle(int a, int b){
		super(a);
		y=b;
	}
	void area() {
		System.out.println("rectangle area is= "+ i*y);
	}
}
public class inheritance {

	public static void main(String[] args) {
		 square s= new square(2);
		 s.area();
		 
		 rectangle r=new rectangle(3,6);
		 r.area();
		 

	}

}
