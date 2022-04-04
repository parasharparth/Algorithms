package practiceTest3;

import util.DisplayArray;
import util.InputNumber;
import util.RandomisedArray;

import java.util.Arrays;
import java.util.Random;
public class BinarySearchRecursion {

	public static void main(String args[])
	{
		//The first step is to get the randomised array
		int[] arr = new Random().ints(10,10,10000).toArray();
		
		//The second step is to sort the array
		Arrays.sort(arr);
		
		//The third step is to display the array
		DisplayArray.result(arr);
		
		//Calculate the left and right
		int left = 0;
		int right = arr.length-1;
		
		//Call binarySearch Function
		int result = binarySearch(InputNumber.input(),arr,left,right);
		if(result == -1)
		{
			System.out.println("The number is not present in the given array");
		}
		else
		{
			System.out.println("The number is present in the array at the position:- "+result);
		}
	}
	
	public static int binarySearch(int num, int[] arr, int left, int right)
	{
		if(right >= left)
		{
			int middle = left + (right-left)/2;
		
			//check if the middle element is equal to the element
			if(arr[middle] == num)
			{
				return middle;
			}
		
			if(arr[middle] > num)
			{
				//Move to the left side of the middle
				return binarySearch(num,arr, left, middle-1);
			}
			else
			{
				//Move to the right side of the middle
				return binarySearch(num,arr, middle+1, right);
			}
		}
		return -1;
	}
}