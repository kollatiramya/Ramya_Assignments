package collection_concept;
import java.util.*;

 class employee{// implements Comparable<employee>{
	String name;
	int id;
	int weight;

public  employee(String name,int id,int weight) {
	this.name=name;
	this.id=id;
	this.weight=weight;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

@Override
public String toString() {
	return "employee [name=" + name + ", id=" + id + ", weight=" + weight + "]";
}



 }
//public int compareTo(employee e) {
	//if(this.getId()==e.getId())
		//return this.getId().compareTo(e.getId());
	//return this.getId().compareTo(e.getId());

// }
public class comparison {
	public static void main(String[] args) {
		List<employee> emp = new ArrayList<>();
		emp.add(new employee("ramya",1234,678));
		emp.add(new employee("naveen",1,45));
		emp.add(new employee("anu",1234,5));
		emp.add(new employee("chinna",12,4578));
		
		for(employee e : emp) {
			System.out.println(e);
			
			

		}
					
	}
		
}







