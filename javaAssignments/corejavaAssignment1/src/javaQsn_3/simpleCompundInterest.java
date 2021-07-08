package javaQsn_3;

import java.util.Scanner;

public class simpleCompundInterest {

	public static void main(String[] args) {
		double simple,compound,principle;
		int time,rate;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount");
		System.out.println("enter the time");
		System.out.println("enter the rate");
		principle=sc.nextDouble();
		time=sc.nextInt();
		rate=sc.nextInt();
		simple=(principle*time*rate)/100;
		compound=principle*Math.pow(1.0+rate/100.0,time)-principle;
		System.out.println("the simple interest for" +time+"years is"+simple);
		System.out.println("the compound interest for" +time+"years is"+compound);

	}

}
