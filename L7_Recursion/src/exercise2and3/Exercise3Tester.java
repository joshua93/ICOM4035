package exercise2and3;

import java.util.ArrayList;
import java.util.Random;

import helperStructures.Pair;

public class Exercise3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random y = new Random();
		SLL<Integer> x = new SLL<>();
		int n = 10;
		for (int i = 0; i<n; i++){
			x.addFirst(y.nextInt(n));
		}
		System.out.println("Original List: "+x);
		
		ArrayList<Pair<Integer>> pairs = x.consecutiveIncreasingPairs();
		for(int z=0; z<pairs.size();z++){
			System.out.print(pairs.get(z));
		}
	}

}
