package CY2023.May.May05;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
		System.out.println("Unsorted Array: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
		quickSort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low -1;
		return 1;
	}
}
