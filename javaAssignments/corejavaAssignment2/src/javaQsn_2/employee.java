package javaQsn_2;

public class employee{
	public static void main (String[] args) {
		labour lb = new labour();
		manager ma = new manager();
		int totalSalary = lb.getMoney()+ma.getMoney();
		System.out.println("total money in the bank:" +totalSalary);
		}
}