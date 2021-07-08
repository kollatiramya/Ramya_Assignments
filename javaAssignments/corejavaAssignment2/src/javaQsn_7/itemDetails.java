package javaQsn_7;

import java.util.Scanner;
public class itemDetails {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter you role");
	String role=sc.nextLine();
	if(role.equalsIgnoreCase("Customer"))
			{
				System.out.println("Enter the item you want to buy : cookies/candy/Ice Cream");
				String item=sc.nextLine();
				System.out.println("Enter the quantity of item you want to buy: ");
				float quan=sc.nextFloat();
				if(item.equalsIgnoreCase("candy"))
				{
					candy c=new candy(quan);
					System.out.println("Your bill is :"+c.getcost());
				}
				else if(item.equalsIgnoreCase("cookies"))
				{
					cookies co=new cookies(quan);
					System.out.println("Your bill is :"+co.getcost());
				}
				else if(item.equalsIgnoreCase("iceCream"))
				{
					iceCream ic=new iceCream(quan);
					System.out.println("Your bill is :"+ic.getcost());
				}

			}
			if(role.equalsIgnoreCase("Owner"))
			{
				System.out.println("Enter the item you want to store: cookies/candy/Ice Cream");
				String item1=sc.nextLine();
				System.out.println("Enter the quantity you want to store: ");
				int quan1=sc.nextInt();
				System.out.println("You stored " +quan1+ " "+ item1);
			}


	}

}