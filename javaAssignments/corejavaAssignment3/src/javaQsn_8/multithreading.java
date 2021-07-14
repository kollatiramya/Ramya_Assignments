package javaQsn_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class multithreading{
 public static void main(String[] args) {
	// List<String> f= new ArrayList<>();
	// List<String> f= new Vector<>();
	 List<String> list= new CopyOnWriteArrayList<>();// by using copyonwritearraylist , it doesnot shows an error. it prints apple banana mango only
	 
	 list.add("apple");
	 list.add("banana");
	 list.add("mango");
	  for(String s : list) {
		  System.out.println(s);
		 list.add("guava");    // by adding element after tranversing . it shows the error ConcurrentModificationException
          
	}                       
	  
 }
}