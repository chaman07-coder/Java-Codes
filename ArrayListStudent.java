package com.dsa;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String args[]) {
     HashMap map= new HashMap();
     map.put(23,"ad");
     map.put("null",23);
     map.put(true, 45);
     System.out.println(map);
     System.out.println(map.get("null"));
     
     HashMap<String,Integer> map1= new HashMap<String,Integer>();
     map1.put("Ankit", 45);
     map1.put("Ankit", 56);
     map1.put("vivek", 20);
     map1.put("naveen", 85);
     map1.put("ravi", 67);
     map1.put("anu", 78);
     map1.put("tej", 32);
     map1.put("aman", 21);
     
     System.out.println(map1);
     Set set1=map1.keySet();
     System.out.println(set1);
	}
}
