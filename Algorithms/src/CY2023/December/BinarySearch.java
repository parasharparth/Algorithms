package CY2023.December;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args){
		//The first step is to initialize the array in question
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};

		//The second step is to get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to search");
		int num = sc.nextInt();
		int result = binarySearch(arr,num,0,arr.length-1);
		if(result == -1)
			System.out.println("not found");
		else
			System.out.println("found");
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		Arrays.sort(arr);
		while(low<=high){
			int middle = low + (high - low)/2;
			if(arr[middle] == element)
				return middle;
			else if(arr[middle] > element)
				high = middle - 1;
			else
				low = middle +  1;
		}
		return -1;
	}
}
