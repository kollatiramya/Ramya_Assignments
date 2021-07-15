package javaQsn_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstLetter {

	public static void main(java.lang.String[] args) {
		StringBuilder str = new StringBuilder();
		List<String> list= new ArrayList<>(Arrays.asList("ramya","Kollati","ram","anu"));
		list.forEach(word -> str.append(word.charAt(0)));
		System.out.println(str);
	}
	}