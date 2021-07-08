package javaQsn_1;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num,temp,sum=0,rem;
	    System.out.println("enter the number");
		 num=sc.nextInt();
		temp=num;
		while(temp!=0) {
			rem=temp%10;
		    sum=sum+(rem*rem*rem);
		    temp=temp/10;
		}
		System.out.println(num==sum? "the given number is armstrong" : "the given number is not armstrong");
	
	}

}
