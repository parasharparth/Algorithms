package practice;

import util.InputArray;
import util.InputNumber;

public class LinearSearch {

	public static void main(String args[])
	{
		int number = InputNumber.input();
		
		int[] arr = InputArray.input();
		linearSearch(arr, number);
	}
	
	public static void linearSearch(int[] arr, int number)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == number)
			{
				System.out.println("Number found at position "+(int)(i+1));
				System.exit(0);
			}
		}
		System.out.println("Number not found in this array");
	}
}
