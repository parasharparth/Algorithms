package practice;

import java.util.Arrays;

import util.InputArray;
import util.InputNumber;
public class RecursiveBinarySearch {

	public static void main(String args[])
	{
		int number = InputNumber.input();
		int[] arr = InputArray.input();
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		recursiveBinarySearch(arr,number,left,right);
	}
	
	public static void recursiveBinarySearch(int[] arr, int number, int left, int right)
	{
		if(right>= left)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == number)
			{
				System.out.println("Number is found at position:- "+ (int)(middle+1));
				System.exit(0);
			}
			else if(arr[middle] > number)
			{
				recursiveBinarySearch(arr, number, left, middle-1);
			}
			else
			{
				recursiveBinarySearch(arr, number, middle+1, right);
			}
		}
		else
		{
			System.out.println("Number not found in this array");
		}
	}
}
