package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperatorsDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();  //arraylist using generic datatype
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(20);
		l.add(null);
	Stream <Integer> stream=l.stream();
	stream.distinct().forEach(System.out::println);
	stream.skip(2).forEach(System.out::println);
	stream.limit(3).forEach(System.out::println);
	
	Integer result=stream.reduce((a,b)->{return a+b;}).orElse(0);
	System.out.println(result);
	
	}

}
