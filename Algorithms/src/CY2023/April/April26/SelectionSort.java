package CY2023.April.April26;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,1,4,2,3,6,5,7,8};
		System.out.println("Unsorted Array");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array");
		selectionSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void selectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int minimum_index = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[minimum_index]){
					minimum_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimum_index];
			arr[minimum_index] = temp;
		}
	}
}
