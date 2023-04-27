package CY2023.April.April26;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,1,4,2,3,6,5,7,8};
		System.out.println("Unsorted Array");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array");
		countingSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void countingSort(int[] arr){
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}

		int[] count = new int[max+1];

		for(int i=0; i<arr.length; i++) count[arr[i]]++;
		for(int i=1; i<=max; i++) count[i] += count[i-1];
		int[] output =  new int[arr.length];
		for(int i=arr.length-1; i>=0; i--){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<arr.length; i++) arr[i] = output[i];
	}
}
