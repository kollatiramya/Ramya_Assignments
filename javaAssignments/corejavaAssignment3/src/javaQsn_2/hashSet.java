package javaQsn_2;
import java.util.*;


public class hashSet {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<>();
		hash.add("zoo");
		hash.add("apple");
		hash.add("monkey");   // Hashset is unordered
		hash.add("dog");
		hash.add("orange");
      for(String s: hash)
    	  System.out.println(s);
	}

}
