package vicitritellacarmida.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterJava8 {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<100; i++) {
			myList.add(i);
		}
		
		int total = myList.stream().filter(i -> i>97).mapToInt(i -> i).sum();
		System.out.println(total);
	}
	
	

}
