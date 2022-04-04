package practice;

import java.util.*;

import util.InputArray;
import util.InputNumber;
public class BinarySearch {

	public static void main(String args[])
	{
		//The first step is to get the input from user
		int number = InputNumber.input();
		
		int[] arr = InputArray.input();
		
		//The second step is to sort the array
		Arrays.sort(arr);
		
		//The third step is to call the binarySearch Function to print the result
		binarySearch(arr,number);
	}
	
	public static void binarySearch(int[] arr, int number)
	{
		//here, we have to find out the left , right and middle
		int left = 0;
		int right = arr.length - 1;
		
		while(left<=right)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == number)
			{
				System.out.println("The number is found at the position:- "+ middle);
				System.exit(0);
			}
			else if(arr[middle] > number)
			{
				//go to the left side of the array
				right = middle-1;
			}
			else
			{
				//go to the right side of the array
				left = middle + 1;
			}
		}
		
		System.out.println("Number not found");
	}
}
