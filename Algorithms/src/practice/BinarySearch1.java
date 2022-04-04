package practice;

import java.util.Arrays;
import java.util.Random;

import util.InputNumber;
public class BinarySearch1 {

	public static void main(String args[])
	{
		int flag = binarySearch(new Random().ints(100,0,1000).toArray(),InputNumber.input());
		if(flag == 1)
		{
			System.out.println("The number is found in the array");
		}
		else
		{
			System.out.println("The number is not found in the array");
		}
	}
	
	public static int binarySearch(int[] arr, int number)
	{
		Arrays.sort(arr);
		int flag = 0;
		int left = 0;
		int right = arr.length-1;
		while(left >= right)
		{
			int middle = left + (right-left)/2;
			if(arr[middle] == number)
			{
				flag = 1;
			}
			else if(arr[middle] > number)
			{
			    //go to the left side
				right = middle - 1;
			}
			else
			{
				//go to the right side
				left = middle + 1;
			}
		}
		return flag;
	}
}
