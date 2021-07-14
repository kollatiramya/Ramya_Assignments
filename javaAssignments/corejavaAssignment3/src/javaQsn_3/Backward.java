package javaQsn_3;
import java.util.*;

public class Backward {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(345);
		number.add(500);
		number.add(134);
		number.add(4);
		number.add(100);
		number.add(25);
		
		//Collections.sort(number);  //ascending order
		/*Collections.sort(number,Collections.reverseOrder()); //descending order 
		for(Integer n : number) {
		System.out.println(n.next());
		}*/
		
		
		ListIterator<Integer> list1=number.listIterator(number.size());  
		 while(list1.hasPrevious())  
        {  
            Integer num=list1.previous();  
            System.out.println(num);  
        }  
		
		
		
	}

}
