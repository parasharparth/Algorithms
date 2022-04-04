package practice;

import java.util.Random;

import util.InputNumber;

public class LinearSearch1 {

	public static void main(String args[])
	{
		int flag = linearSearch(new Random().ints(10, 0, 100).toArray(), InputNumber.input());
		
		if(flag == 1)
		{
			System.out.println("The number is found in the array");
		}
		else
		{
			System.out.println("The number is not fount in the array");
		}
	}
	public static int linearSearch(int[] arr, int num)
	{
		int flag = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				flag = 1;
				return flag;
			}
		}
		return flag;
	}
}

