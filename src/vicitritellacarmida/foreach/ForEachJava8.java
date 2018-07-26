package vicitritellacarmida.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachJava8 {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			myList.add(i);
		}
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("pake foreach:  " + t);
				
			}
		});
		
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
	}
	

	
}
class MyConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println("Consumer value: "+t);
		System.out.println("vici tambah nilainya: "+t+2);
		
	}
}
