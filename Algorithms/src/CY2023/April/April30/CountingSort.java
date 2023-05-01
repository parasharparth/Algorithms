package CY2023.April.April30;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,8,9,7,4,6,5,1,3,2};
		System.out.println("Unsorted array: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted array: ");
		countingSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void countingSort(int[] arr){

	}
}
