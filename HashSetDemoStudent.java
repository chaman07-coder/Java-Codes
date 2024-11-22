package com.dsa;

import java.util.HashSet;

class Employee{
	String ename;
	int salary;
	public Employee(String ename, int salary) 
	{
		super();
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	public boolean equals (Object obj) 
	{
		Employee e1=(Employee)obj;
		if(e1.ename==this.ename && e1.salary==this.salary) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashcode()
	{
		String strEname=ename;
		String strSalary=String.valueOf(salary);
		int hashEname=strEname.hashCode();
		int hashSalary=strSalary.hashCode();
		int hash=0;
		hash=hash+hashEname+hashSalary;
		return hash;
	}
}
public class HashSetDemoStudent {
       public static void main(String[]args) {
    	   HashSet gsv=new HashSet();
    	   Employee e1= new Employee("kiran",45000);
    	   Employee e2= new Employee("kiran",45000);
    	   Employee e3= new Employee("vivek",3000);
    	   
    	   gsv.add(e1);
    	   gsv.add(e2);
    	   gsv.add(e3);
    	   System.out.println(gsv);
    	   
       }
}
/*list and set workon key values but map work on key values*/