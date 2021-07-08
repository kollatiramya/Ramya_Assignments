package javaQsn_2;

public class armstrongRange {
	

	public static void main(String[] args) {
		armstrongRange(100,999);

	}
	public static boolean isArmstrong(int n) {
		boolean result=false;
		
		int sum=0,rem;
		int temp=n;
		 while(temp!=0)
		 {
			 rem = temp%10;
		     sum=sum+(rem*rem*rem);
		     temp=temp/10;
		 }
		 if(sum==n) {
			 result=true;
		 }
		
		return result;
	}
	public static void armstrongRange(int start,int end) {
		for(int i=start;i<=end;i++) {
			if(isArmstrong(i)) {
				System.out.println("Amstrong number:"+i);
			}
		}
				
	}
}
