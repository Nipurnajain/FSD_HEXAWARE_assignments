package collections;

import java.util.Set;
import java.util.TreeSet;

import pojo.Employee;

//ctrl+shift+o for imports
public class TreeDemo {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<String>();
		set.add("d");
		set.add("b");
		set.add("a");
		set.add("c");
		System.out.println(set);
		
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(23);
		set1.add(2);
		set1.add(10);
		set1.add(21);
		System.out.println(set1);
		
		Set<Employee> set3=new TreeSet<Employee>(new MyComparator());
		set3.add(new Employee(103,"Ravi",3000));
		set3.add(new Employee(104,"Advait",9000));
		set3.add(new Employee(102,"Nipurna",32000));
		set3.add(new Employee(106,"Smith",3000));
		
		System.out.println(set3);  //will give error bcoz this cant be sorted or compared

	}

}
