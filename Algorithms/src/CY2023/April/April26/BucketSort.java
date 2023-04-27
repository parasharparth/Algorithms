package CY2023.April.April26;

import java.util.Arrays;

public class BucketSort {
	public static void main(String[] args){
		int[] arr = new int[]{0,1,4,2,3,6,5,7,8};
		System.out.println("Unsorted Array");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Sorted Array");
		//bucketSort(arr);
		Arrays.stream(arr).forEach(System.out::print);
	}
}
