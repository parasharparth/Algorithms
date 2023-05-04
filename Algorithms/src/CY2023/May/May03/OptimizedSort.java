package CY2023.May.May03;

import java.util.Arrays;

public class OptimizedSort {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
		System.out.println("Unsorted Array: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
//		bubbleSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	
}
