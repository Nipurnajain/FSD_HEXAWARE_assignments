package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(103, "ravi");
		map.put(102, "smith");
		map.put(10, "tom");
		map.put(103, "nipurna");
		map.put(99, "tom");
		
		
		System.out.println(map);
		Set<Integer> set= map.keySet();
		Iterator<Integer> it= set.iterator();
		while(it.hasNext()) {
			Integer k=it.next();
			System.out.println(k+ " " + map.get(k));
		}
		
		Collection<String> list= map.values();
		for(String name :list) {
			System.out.println(name);
		}
	}

}
