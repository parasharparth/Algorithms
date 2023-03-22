package CY2023.March.Mar22.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,4,3,2,5,6,7,9,0};
		int result = binarySearch(arr, 2 , 0 , arr.length-1);
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
		while(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element){
				return middle;
			}
			else if(arr[middle] > element){
				high = middle - 1;
			}
			else
			{
				low = middle + 1;
			}
		}
		return -1;
	}
}
