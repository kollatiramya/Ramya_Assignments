package javaQsn_6;

abstract class Persistsnce{
	public abstract void persist();
}

class Filepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Ramya Kollati");
	}
}

class Databasepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Happy Home");
	}
}
public class invokes_persist {

	public static void main(String[] args) {
		Persistsnce per = new Filepersistance();
		per.persist();
		Persistsnce per1 = new Databasepersistance();
		per1.persist();

	}

}