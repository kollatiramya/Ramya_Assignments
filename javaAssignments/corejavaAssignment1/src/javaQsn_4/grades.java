package javaQsn_4;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		int sub []= new int[3];
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the three subject marks");
		for (int i=0;i<3;i++)
			sub[i]= sc.nextInt();
		for (int i=0;i<3;i++) {
		         if(sub[i]>=60)
			          count++;
		     }
		if(count==3)
			System.out.println("passed");
		else if (count==2)
			System.out.println("promoted");
		else 
			System.out.println("failed");

	}

}
