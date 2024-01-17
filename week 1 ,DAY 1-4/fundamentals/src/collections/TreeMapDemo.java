package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(103, "ravi");
		map.put(102, "smith");
		map.put(10, "joe");
		map.put(99, "tom");
		
		
		System.out.println(map);

	}

}
