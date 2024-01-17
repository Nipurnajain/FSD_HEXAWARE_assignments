package pojo;

import java.util.HashSet;
import java.util.Set;

public class EmpTreeSet {

	public static void main(String[] args) {
		
		Set <Employee> set=new HashSet<Employee>();
		set.add(new Employee(101,"king",3000));
		set.add(new Employee(101,"smith",40000));
		System.out.println(set);
		
// if there are any duplicate values then those will not be printed bcoz we have used hashcode and equals method based on eid 
		
		set.add(new Employee(101,"king",3000));
		set.add(new Employee(102,"smith",40000));
		System.out.println(set);
		
	}

	
}
