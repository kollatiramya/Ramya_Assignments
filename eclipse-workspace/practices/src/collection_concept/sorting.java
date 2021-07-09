package collection_concept;
import java.util.*;

public class sorting {

	

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ramya");
		names.add("kollati");
		names.add("zoo");
		names.add("monkey");
		names.add("apple");
		names.add("bat");
		//Collections.sort(names); // sorted order
		//Collections.sort(names,Collections.reverseOrder());  // reverse order
		for(Object nam : names) {
			System.out.println(nam);
		}
		
		

	}

}
