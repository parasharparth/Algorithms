package practiceTest;

import java.util.Arrays;

import practice.InputNumber;
import practice.RandomisedArray;

public class BinarySearchUsingRecursion {

	public static void main(String args[])
	{
		int[] arr = RandomisedArray.getRandomizedArray();
		int left = 0;
		int right = arr.length-1;
		int result = binarySearch(InputNumber.input(),arr,left,right);
		if(result ==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at the position "+result);
		}
	}
	
	public static int binarySearch(int num, int[] arr,int left, int right)
	{
		//The first step is to sort the array
		Arrays.sort(arr);
		
		//The second step is to find middle and move forward from there
		if(right >= left)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == num)
			{
				return middle;
			}
			else if(num > arr[middle])
			{
				//move to the right side
				binarySearch(num,arr,middle+1,right);
			}
			else
			{
				//move to the left side
				binarySearch(num,arr,left,middle-1);
			}
		}
		return 0;
	}
}
