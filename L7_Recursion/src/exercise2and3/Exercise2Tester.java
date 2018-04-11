package exercise2and3;

import java.util.Random;

public class Exercise2Tester {
	
	public static void main(String[] args){
		Random y = new Random();
		SLL<Integer> x = new SLL<>();
		for (int i = 0; i<10; i++){
			x.addFirst(y.nextInt(100));
		}
		System.out.println("Original List: "+x);
		
		x.reverse();
		System.out.println("Reversed List: "+x);
	}
		
	
}
