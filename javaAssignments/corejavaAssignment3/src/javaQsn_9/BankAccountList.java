package javaQsn_9;
import java.util.LinkedHashSet;
import java.util.Set;

class SavingAccount implements Comparable <SavingAccount>{
	 double acc_balance;
	 int acc_id;
	 String accountHoldername;
	 double SalaryAccount;
	 
	 public SavingAccount(double acc_balance,int acc_id,String accountHoldername,double SalaryAccount) {
		 this.acc_balance=acc_balance;
		 this.acc_id= acc_id;
		 this.accountHoldername=accountHoldername;
		 this.SalaryAccount=SalaryAccount;
		 
	 }

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public double getSalaryAccount() {
		return SalaryAccount;
	}

	public void setSalaryAccount(double salaryAccount) {
		SalaryAccount = salaryAccount;
	}
	
	public void withdraw() {
		
	}
	public void deposit() {
		
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", accountHoldername="
				+ accountHoldername + ", SalaryAccount=" + SalaryAccount + "]";
	}
	
	 public int compareTo(SavingAccount o) {
	    	if(this.getAcc_id()==o.getAcc_id())
	    		return -1;
	    	else
	    		return 1;
	    }
}
 
 public class BankAccountList {
	 
 public static void main(String[] args) {
	 
	 Set<SavingAccount> sa = new LinkedHashSet<>();
	 sa.add(new SavingAccount(123,1,"ramya",1000));
	 sa.add(new SavingAccount(999,2,"anu",20000));
	 sa.add(new SavingAccount(500,3,"chinna",15000));
	 sa.add(new SavingAccount(300,14,"dolly",500));
	 sa.add(new SavingAccount(123,1,"ramya",1000));
	 for(SavingAccount s : sa)
	 System.out.println(s);
 }
	 
	 
 
 
 }
