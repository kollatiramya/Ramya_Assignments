package javaQsn_2;
import java.util.*;


public class linkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hash = new LinkedHashSet<>();
		hash.add("zoo");
		hash.add("apple");
		hash.add("monkey");   // Hashset is ordered
		hash.add("dog");
		hash.add("orange");
      for(String s: hash)
    	  System.out.println(s);
	}

}