package practice;

import java.util.*;

import util.InputArray;
import util.InputNumber;
public class BinarySearch2 {

	public static void main(String args[])
	{
		int number = InputNumber.input();
		int[] arr = InputArray.input();
		Arrays.sort(arr);
		binarySearch(arr,number);
	}
	
	public static void binarySearch(int[] arr, int number)
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == number)
			{
				System.out.println("The element is found at the position: -"+(int)(middle+1));
				System.exit(0);
			}
			else if(arr[middle] > number)
			{
				right = middle-1;
			}
			else
			{
				left = middle+1;
			}
		}
		
		System.out.println("Number is not present in this array");
	}
}
