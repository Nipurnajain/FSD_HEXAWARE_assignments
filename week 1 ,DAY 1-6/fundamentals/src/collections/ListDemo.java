package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>(); //arraylist
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(20);
		list.add(null);
		list.add("hello");
		list.add(4.5);
		System.out.println(list);
		
		List<Integer> l = new ArrayList<>();  //arraylist using generic datatype
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(20);
		l.add(null);
		System.out.println(l);
		
		List<Number> link = new LinkedList<>(); //linked list using number datatype
		link.add(2);
		link.add(4.5);
		link.add(3.99f);
		link.add(99667744l);
		System.out.println(link);
		
		Iterator it= list.iterator(); //using iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Number n: link) {         //for each loop
			System.out.println(n);
		}
		

	}

}
