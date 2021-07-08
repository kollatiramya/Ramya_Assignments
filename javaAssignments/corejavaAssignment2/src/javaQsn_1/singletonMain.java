package javaQsn_1;

public class singletonMain {

	public static void main(String[] args) {
		
				singleton x = singleton.singleton();
				singleton y = singleton.singleton();
				singleton z = singleton.singleton();

				x.s = (x.s).toUpperCase();

				System.out.println("String from x is " + x.s);
				System.out.println("String from y is " + y.s);
				System.out.println("String from z is " + z.s);
				System.out.println("\n");

				z.s = (z.s).toLowerCase();

				System.out.println("String from x is " + x.s);
				System.out.println("String from y is " + y.s);
				System.out.println("String from z is " + z.s);


	}

}