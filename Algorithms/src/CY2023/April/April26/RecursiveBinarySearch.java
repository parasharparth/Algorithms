package CY2023.April.April26;

import java.util.Arrays;

public class RecursiveBinarySearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,6,4,1,3,7};
		int result = binarySearch(arr, 4, 0, arr.length-1);
		if(result == -1) System.out.println("Not Found");
		else System.out.println("Found at position: "+ result);
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		if(low <= high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element) return middle;
			else if(arr[middle] > element) return binarySearch(arr, element, low, middle - 1);
			else return binarySearch(arr, element, middle+1 , high);
		}
		return -1;
	}
}
