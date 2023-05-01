package CY2023.April.April30;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,8,9,7,4,6,5,1,3,2};
		System.out.println("Unsorted array: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted array: ");
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
		int i=low-1;
		for(int j=low; j<high; j++){
			if(arr[j]<pivot){
				i++;
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}
}
