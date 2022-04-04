package practiceTest;

import java.util.Arrays;

import util.InputNumber;
import util.RandomisedArray;

public class BinarySearch {

	public static void main(String args[])
	{
		binarySearch(InputNumber.input(), RandomisedArray.getRandomizedArray());
	}
	
	public static void binarySearch(int num, int[] arr)
	{
		//The first step is to sort the array
		Arrays.sort(arr);
		
		//Then, we will get the middle element and then revolve around it.
		int left = 0;
		int right = arr.length-1;
		
		while(left >= right)
		{
			int middle = left + (right-left)/2;
			
			if(num == arr[middle])
			{
				System.out.println("The number is found in the array at the position "+middle);
			}
			else if(arr[middle] > num)
			{
				//move to the left side
				right = middle - 1;
			}
			else 
			{
				//move to the right
				left = middle + 1;
			}
		}
		System.out.println("The number is not present in the array");
	}
}
