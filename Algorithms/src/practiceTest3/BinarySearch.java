package practiceTest3;

import java.util.Arrays;

import util.DisplayArray;
import util.InputNumber;
import util.RandomisedArray;

public class BinarySearch {

	public static void main(String args[])
	{
		int[] arr = RandomisedArray.getRandomizedArray();
		DisplayArray.result(arr);
		
		Arrays.sort(arr);
		int result = binarySearch(InputNumber.input(),arr);
		
		if(result == -1)
		{
			System.out.println("The number is not found in the array");
		}
		else
		{
			System.out.println("The number is found in the array at the location: -"+result);
		}
	}
	
	public static int binarySearch(int num, int[] arr)
	{
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == num)
			{
				return middle;
			}
			else if(arr[middle] > num)
			{
				//move to the left side
				right = middle-1;
			}
			else
			{
				//move to the right side
				left = middle+1;
			}
		}
		return -1;
	}
}
