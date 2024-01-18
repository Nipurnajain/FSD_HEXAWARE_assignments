package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
//		Stream stream=Stream.of(10,50,60,89);  
//		long count=stream.count();
//		System.out.println(count);
//	    Comparator<Integer> comparator=(i1,i2)->{return i1.toString().compareTo(i2.toString())};
//        Optional<integer> optional
		
		
		String names[]= {"satish","ravi","ford","adam","king"};
		Stream<String> stream2= Arrays.stream(names);
		stream2.map((str)->{System.out.println(str);return str.length();})
		.forEach((len)->{System.out.println(len);});
		
		
		List<String> list =Arrays.asList(names);
		Stream<String> stream3=list.stream();             //converting collection to stream
		stream3.map((str)->{return str.length();})
		    .filter((len)->{return len>4;})               //filter takes predicate expressions
		    .forEach(System.out::println);                //method reference
		
		
		
		
		
	}

}
