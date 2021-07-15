package javaQsn_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class upperCase {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>(Arrays.asList("ramya","kollati","ram","anu"));
		System.out.println(list);
		
		List<String> s= new ArrayList<>();
		s.add("good");
		System.out.println(s);
		
		
		list.replaceAll(n -> n.toLowerCase()); 
		System.out.println(list);
		
		list.replaceAll(n -> n.toUpperCase());
		System.out.println(list);
	

	}
}
