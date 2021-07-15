package javaQsn_4;

import java.util.*;

public class oddLength {

	public static void main(String[] args) {
		List <String> student = new ArrayList<>();
		student.add("ramya");
		student.add("kollati");
		student.add("anusha");
		student.add("naveen");
		student.removeIf((n->(n.length()%2!=0)));
		for(String s : student)
			System.out.println(s);
	}
	

}