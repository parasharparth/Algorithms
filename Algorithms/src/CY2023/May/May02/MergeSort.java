package CY2023.May.May02;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,6,5,4,3,2,1};
		System.out.println("Unsorted Array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array: ");
		mergeSort(arr,0,arr.length-1);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static void mergeSort(int[] arr, int low, int high){
		if(low < high){
			int middle = low + (high - low)/2;
			mergeSort(arr, low, middle);
			mergeSort(arr, middle+1, high);
			merge(arr, low, middle, high);
		}
	}

	public static void merge(int[] arr, int low, int middle, int high){
		int length1 = middle - low + 1;
		int length2 = high - middle;
		int[] arr1 = new int[length1];
		int[] arr2 = new int[length2];
		for(int i=0; i<length1; i++){
			arr1[i] = arr[low + i];
		}
		for(int j=0; j<length2; j++){
			arr2[j] = arr[middle+j+1];
		}
		int i=0;
		int j=0;
		int k = low;
		while(i<length1 && j<length2){
			if(arr1[i] < arr2[j]){
				arr[k] = arr1[i];
				i++;
			}
			else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<length1){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<length2){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
}
