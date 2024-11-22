package com.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String []args) {
    	HashSet set= new HashSet();  //do not allow duplicates,unique and unordered,no null value can be stored
    	set.add(34);
    	set.add(334);
    	set.add(342);
    	set.add(342);
    	set.add(345);
    	System.out.println(set);
    	HashSet set1=new HashSet();
    	set1.add(34);
    	set1.add(4);
    	set1.add(12);
    	set1.add(78);
    	set1.add(67);
    	System.out.println(set1);
    	set1.addAll(set);
    	System.out.println(set1);
    	set1.contains(34);
    	Iterator ite =set1.iterator();
    	while(ite.hasNext()) {
    		System.out.println(ite.next());
    	}
    	set1.remove(34);
    	set1.contains(34);
    	set1.retainAll(set);
    	set1.clear();
    	
    	/*HashSet h=new HashSet();
    	
		h.add(34);
		h.add(23);
		h.add(12);
		h.add(56);*/
    }
}
