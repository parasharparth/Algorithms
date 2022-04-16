package practiceTest2;

import util.DisplayArray;
import util.InputNumber;
import util.RandomisedArray;

public class LinearSearch {

	public static void main(String args[])
	{
		int[] arr = RandomisedArray.getRandomizedArray();
		DisplayArray.result(arr);
		int result = linearSearch(InputNumber.input(),arr);
		
		if(result == 0)
		{
			System.out.println("The number is not found in the array");
		}
		else
		{
			System.out.println("The number is found at position:- " + result);
		}
	}
	
	public static int linearSearch(int num, int[] arr)
	{		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				return i;
			}
		}
		return 0;
	}
}
