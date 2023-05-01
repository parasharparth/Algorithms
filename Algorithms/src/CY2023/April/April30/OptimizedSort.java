package CY2023.April.April30;

import java.util.Arrays;

public class OptimizedSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,8,9,7,4,6,5,1,3,2};
		System.out.println("Unsorted array: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted array: ");
		optimizedSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void optimizedSort(int[] arr){
		for(int i=0; i<arr.length; i++){
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
