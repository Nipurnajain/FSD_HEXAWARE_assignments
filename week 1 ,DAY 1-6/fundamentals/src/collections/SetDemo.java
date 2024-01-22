package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("king");
        set.add("adam");
        set.add("smith");
        set.add("ford");
        System.out.println(set);
        
        Set<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
        set1.add(34);
        set1.add(4);
        set1.add(9);
        System.out.println(set1);
        
        for (Integer i : set1) {      
			System.out.println(i);
		}
	}

}
