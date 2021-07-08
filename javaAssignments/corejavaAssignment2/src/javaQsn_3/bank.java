package javaQsn_3;

public class bank{
	public static void main (String[] args) {
		savingAccount sa = new savingAccount();
		currentAccount ca = new currentAccount();
		int totalCash = sa.getMoney()+ca.getMoney();
		System.out.println("total money in the bank:" +totalCash);
		}
}