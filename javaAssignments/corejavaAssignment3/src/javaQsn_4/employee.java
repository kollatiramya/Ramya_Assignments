package javaQsn_4;
import java.util.*;
import java.util.Map.Entry;



 class dateOfBirth   {
	private int date;
	private int month;
	private int year;
	 public dateOfBirth (int date,int month, int year) {
		this.date = date;
		this.month = month;
		this.year=year;
	 }
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "dateOfBirth [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
@Override
public int hashCode() {
	return Objects.hash(date,month);
}
@Override
public boolean equals(Object o) {
	if(this==o)
		return true;
	if(o==null)
		return false;
	if(getClass()!=o.getClass())
		return false;
	dateOfBirth other =(dateOfBirth) o;
	return date== other.date && month == other.month;
	
	
}
}


public class employee {
	public static void main (String[] args) {
		String employeename;
		dateOfBirth dob1 = new dateOfBirth(31,10,1999);
		dateOfBirth dob2 = new dateOfBirth(28,05,1998);
		dateOfBirth dob3 = new dateOfBirth(13,02,1997);
		dateOfBirth dob4 = new dateOfBirth(31,10,2000);
		
		Map<dateOfBirth,String> dobemname = new HashMap<>();
		dobemname.putIfAbsent(dob1,"ramya");
		dobemname.putIfAbsent(dob2,"anusha");
		dobemname.putIfAbsent(dob3,"chinna");
		dobemname.putIfAbsent(dob4,"bunny");
		
		for(Map.Entry m:dobemname.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }   
	
	
	
		
		
		}

}
