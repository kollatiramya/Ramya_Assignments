package javaQsn_5;

import java.util.Scanner;

public class incomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double amount,taxamount;
		int percent;
		
	       System.out.println("enter the amount");
	       amount = sc.nextDouble();
	       if(amount>=0 && amount<=180000) {
	    	   taxamount=amount;
	       System.out.println("totalamount is \t:" +amount);
	       }
	       else if(amount>=180001 && amount<=300000) {
	    	   percent=10;
	    	   taxamount=amount*percent;
	    	   System.out.println("totalamount is \t:" +taxamount);
	       }
	       else if(amount>=300001 && amount<=500000) {
	    	   percent=20;
	    	   taxamount=amount*percent;
	    	   System.out.println("totalamount is \t:" +taxamount);
	       }
	       else {
	    	   percent=30;
	    	   taxamount=amount*percent;
	    	   System.out.println("totalamount is \t:" +taxamount);
	       }
	    	   
	   }

}
