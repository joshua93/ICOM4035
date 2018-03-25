package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class ArraySorterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};

		SelectionSortSorter<Integer> SelectSorter = new SelectionSortSorter<>();
		BubbleSortSorter<Integer> BubbleSorter = new BubbleSortSorter<>();
		InsertionSortSorter<Integer> InsertionSorter = new InsertionSortSorter<>();

		IntegerComparator1 int1 = new IntegerComparator1();		
		IntegerComparator2 int2 = new IntegerComparator2();

		System.out.println("Selection Sort using Comparator1: ");
		SelectSorter.sort(arr,int1);
		for (int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]); 
		}
		System.out.println(" \n");
		//----------------------------------------------------------------------------
		System.out.println("Selection Sort using Comparator 2: ");
		SelectSorter.sort(arr,int2);
		for (int i=0; i<arr.length; i++) 
			System.out.print(" " + arr[i]); 
		System.out.println(" \n");
		//-----------------------------------------------------------------------------
		System.out.println("Bubble Sort using Comparator 1: ");
		BubbleSorter.sort(arr, int1);
		for (int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]); 
		}
		System.out.println(" \n");
		//------------------------------------------------------------------------------
		System.out.println("Bubble Sort using Comparator 2: ");
		BubbleSorter.sort(arr, int2);
		for (int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]); 
		}
		System.out.println(" \n");
		//------------------------------------------------------------------------------
		System.out.println("Insertion sort using Comparator 1: ");
		InsertionSorter.sort(arr, int1);
		for (int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]); 
		}
		System.out.println(" \n");
		//------------------------------------------------------------------------------
		System.out.println("Insertion Sort using Comparator 2: ");
		InsertionSorter.sort(arr, int2);
		for (int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]); 
		}








	}

}
