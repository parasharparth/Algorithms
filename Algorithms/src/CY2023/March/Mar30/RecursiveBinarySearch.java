package CY2023.March.Mar30;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,5,4,3,6,8,2};
		int result = binarySearch(arr,2,0,arr.length-1);
		if(result!= -1){
			System.out.println("Element found on position "+ result);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		if(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element){
				return middle;
			}
			else if(arr[middle] > element){
				return binarySearch(arr, element, low,middle-1);
			}
			else {
				return binarySearch(arr, element, middle+1, high);
			}
		}
		return -1;
	}
}
