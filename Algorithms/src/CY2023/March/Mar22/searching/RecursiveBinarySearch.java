package CY2023.March.Mar22.searching;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,4,3,2,8,7,5,6,0,9};
		int result = binarySearch(arr, 2, 0, arr.length-1);
		if(result == -1){
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at position: "+result);
		}
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		if(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element){
				return middle;
			}
			else if(arr[middle] < element){
				binarySearch(arr, element, middle + 1, high);
			}
			else{
				binarySearch(arr, element, low, middle - 1);
			}
		}
		return -1;
	}
}
