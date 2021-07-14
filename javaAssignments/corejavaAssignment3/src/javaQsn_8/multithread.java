package javaQsn_8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class multithread {

	public static void main(String[] args) {
		
 //   Map<Integer,String>fruits = new HashMap<>();
 Map<Integer,String>fruits = new ConcurrentHashMap<>();
		 fruits.put(1,"apple");
		 fruits.put(2,"banana");
		 fruits.put(3,"mango");
		 for(Integer key :fruits.keySet()) {
			 System.out.println( +key+ " "+fruits.get(key));
			 fruits.put(4,"guava");
		 }

	}

}
