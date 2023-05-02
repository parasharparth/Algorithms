package CY2023.May.May02;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,6,5,4,3,2,1};
		System.out.println("Unsorted Array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
		insertionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int key = arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
	}
}
