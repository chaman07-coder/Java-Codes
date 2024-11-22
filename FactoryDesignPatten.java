package com.dsa;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>car=new LinkedList<String>();   //unsynchronized
		car.add("Alto");
		car.add("BMW");
		car.add("TATA");
		System.out.println(car);
		car.addFirst("45");
		System.out.println(car);
		Vector v1=new Vector();    //synchronized
        v1.add(34);
        v1.add(90);
        v1.add(23);
        v1.add(12);
        System.out.println(v1);
        Collections.sort(v1);
        System.out.println(v1);
        
        System.out.println("Forward....");   //iterate from forward
   	 ListIterator listiter=v1.listIterator();
   	 while(listiter.hasNext()) {
   		 Object obj2=listiter.next();
   		 System.out.println(obj2);
   	 }
   	 //deque
   	   System.out.println("Deque operation: ");
        Deque<Integer>deque=new ArrayDeque<Integer>();
        deque.add(23);
        deque.add(3);
        deque.add(223);
        deque.add(21);
       
        System.out.println(deque);
         //last element poll
        System.out.println(deque.peek()); 
        deque.addFirst(34);
        deque.addLast(21);
        deque.removeFirst();
        deque.pollLast(); 
        
        
        //stack
        System.out.println("Stack operation: ");
        Stack<String> s1=new Stack<String>();
        s1.push("45");
        s1.pop();
        
        
	}

}
