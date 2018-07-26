package vicitritellacarmida.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<100; i++) {
			myList.add(i);
		}
		
		Stream<Integer> sequentialStream = myList.stream();
		Stream<Integer> parallelStream = myList.parallelStream();
		
		Stream<Integer> highNums = sequentialStream.filter(x -> x>90);
		highNums.forEach(x -> System.out.println(x));
		
		Stream<Integer> highNumsPar = parallelStream.filter(x -> x>90);
		highNumsPar.forEach(x -> System.out.println("par"+x));
	}

}
