package javaQsn_6;

import java.util.Scanner;
public class CUI {
	
	public static void main(String[] args) {
		
		
		if(!validateUser()) {
			System.out.println("COntact Admin");
		}
		
		
	}
	public static boolean validateUser( ) {
		boolean result=false;
		String username, password;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter the username");
			username = sc.nextLine();
			System.out.println("Enter the password");
			password = sc.nextLine();
			if(username.equals("ramya") &&(password.equals("kollati"))) {
				System.out.println("Welcome \t "+username);
				result=true;
				return result;
			}
				
			
		}
		return result;
		
	}
}