package CY2023.May.May02;

import java.util.Arrays;
import java.util.StringTokenizer;

public class OptimizedSort {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,6,5,4,3,2,1};
		System.out.println("Unsorted Array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
		optimizedSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void optimizedSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			boolean swapped = false;
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
}
