package javaQsn_5;
import java.util.Map.Entry;
import java.util.*;

class department {
	private Integer deptId;
	private String deptName;
	private String deptLocation;

	public department(Integer deptId,String deptName,String deptLocation)
	{
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	
	public String toString()
    {
    	return "Department [deptId=" + deptId + ", deptName="+deptName+ "]";
    }
}
class employee {
	private Integer employeeId;
	private String employeeName;
	private Integer salary;
	private String email;
	
	public employee(Integer employeeId,String employeeName, Integer salary,String email)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}
	public Integer getemployeeId(){
		return employeeId;
	}
	public String getemployeeName(){
		return employeeName;
	}
	public Integer getsalary(){
		return salary;
	}
	public String getemail(){
		return email;
	}

	public String toString()
    {
    	return "employee [employeeId=" + employeeId + ", employeeName="+employeeName+", Salary"+salary+"]";
    }
	
	@Override
	public int hashCode() {
		return 31;
	}
	@Override
	public boolean equals(Object o) {
		if(this==o)
			return true;
		if(o==null)
			return false;
		if(getClass()!=o.getClass())
			return false;
		return true;
		
		}

}

public class Main{

	public static void main(String[] args) {
		employee e1=new employee(1009,"ramya",15000,"ramya@mail.com");
		employee e2=new employee(1020,"kollati",30000,"kollati@mail.com");
		employee e3=new employee(1005,"Anusha",24500,"anusha@mail.com");
		employee e4=new employee(1010,"happy",30000,"happy@gmail.com");
		
		department d1 = new department(15000,"ECE","MUMBAI");
		department d2 = new department(30000,"CSE","HYDERABAD"); 
		
		Hashtable<employee,department> empDeptMap = new Hashtable<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		for(Map.Entry m:empDeptMap.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
			
		}
		
		
		
	}

