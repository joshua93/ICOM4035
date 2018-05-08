package testerClasses;

import java.util.Comparator;

public class IntegerComparator2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}




/**
 * EXCERCISE 2 ANSWER:
 * In the above cases, all the sorting objects are created using IntegerComparator1. 
 * Change it to IntegerComparator2 in those three cases and run again. 
 * Do your notice any difference in the final sorted output? Explain why. 
 * 
 * =The difference is in the order of the sorted elements. It's now sorted in increasing order
 * It is because the comparator 2 class swaps the elements to compare. 

 */

