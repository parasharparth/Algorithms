package CY2023.April.April26;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,1,4,2,3,6,5,7,8};
		System.out.println("Unsorted Array");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array");
		insertionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int j= i-1;
			int key = arr[i];
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
	}
}
