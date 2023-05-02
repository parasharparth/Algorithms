package CY2023.May.May02;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
		System.out.println("Unsorted Array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
		radixSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void radixSort(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		for(int place = 1; max /place >0; place*=10)
			countingSort(arr, place);
	}

	public static void countingSort(int[] arr, int place){
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		int[] count = new int[max+1];
		for(int i=0; i<arr.length; i++)
			count[arr[i]]++;
		for(int i=1; i<=max; i++)
			count[i] += count[i-1];
		int[] output = new int[arr.length+1];
		for(int i=0; i<arr.length; i++){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<arr.length; i++){
			arr[i] = output[i];
		}
	}
}
