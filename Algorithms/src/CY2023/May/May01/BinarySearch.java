package CY2023.May.May01;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,1,2,3,4};
		int result = binarySearch(arr, 4, 0, arr.length-1);
		if(result == -1) System.out.println("Not Found");
		else System.out.println("Found at position: "+ result);
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		if(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element) return middle;
			else if(arr[middle] > element) return binarySearch(arr, element, 0, middle-1);
			else return binarySearch(arr, element, middle+1, high);
		}
		return -1;
	}
}
