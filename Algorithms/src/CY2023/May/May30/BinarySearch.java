package CY2023.May.May30;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,1,2,3,5,4,7,6};
		System.out.println("The given array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Input the element you want to find");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		sc.close();
		binarySearch(arr, element, 0, arr.length-1);
		}

		public static int binarySearch(int[] arr, int element, int low, int high){
			return -1;
		}
}
