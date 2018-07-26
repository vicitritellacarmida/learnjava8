package vicitritellacarmida.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterJava8 {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<100; i++) {
			myList.add(i);
		}
		
		int total = myList.stream().filter(i -> i>97).mapToInt(i -> i).sum();
		System.out.println(total);
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		Stream<String> stringStream = Stream.of("a", "b","c");
		
		Stream<String> stream1 = Stream.generate(() -> "ab");
		/*List<String> stream1Str = stream1.collect(collector)*/
	}
	
	

}
