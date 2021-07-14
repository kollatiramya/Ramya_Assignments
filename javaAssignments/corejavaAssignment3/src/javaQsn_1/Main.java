package javaQsn_1;
import java.util.TreeSet;

import java.util.*;
 class person implements Comparable<person>{
	
	String name;
	Integer weight;
	Integer height;
	
	
	 public person(Integer height,Integer weight, String name)
	{
		super();
		this.height=height;
		this.weight= weight;
		this.name = name;
	}
	
	public Integer getHeight() {
		return height;
	}
	public Integer getWeight() {
		return weight;
	}
    public String getName() {
    	return name;
    }
    public String toString()
    {
    	return"person [name is "+name+", Height is "+height+", Weight is "+weight+"]";
    }
    
    public int compareTo(person o) {
    	if(this.getWeight()==o.getWeight())
    		return this.getHeight().compareTo(o.getHeight());
    	else
    		return this.getWeight().compareTo(o.getWeight());
    }
}

public class Main {

	public static void main(String[] args) {
		 TreeSet<person> ts = new TreeSet<>();
		 ts.add(new person(120,45,"ramya"));
		 ts.add(new person(120,35,"kollati"));
		 ts.add(new person(160,65,"anusha"));
		 ts.add(new person(130,65,"vicky"));
		 ts.add(new person(105,25,"dolly"));
		 
		 for(person element : ts)
			 System.out.println(element);
		 
	}

}
