package CY2023.May.May03;

import java.util.Arrays;

public class RecursiveBinarySearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,32,1};
		int result = recursiveBinarySearch(arr, 4, 0 , arr.length-1);
		if(result == -1) System.out.println("Not Found");
		else System.out.println("Found at position :"+ result);
	}

	public static int recursiveBinarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		if(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element) return middle;
			else if(arr[middle] > element) return recursiveBinarySearch(arr, element, low, middle - 1);
			else return recursiveBinarySearch(arr, element, middle+1, high);
		}
		return -1;
	}
}
