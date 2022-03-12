package searching;

import java.util.*;
public class LinearSearch {

	/**************************************************************************************
	 * This is a program for linear search where the elements are searched for one by one
	 **************************************************************************************/
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to be searched");
		int element = sc.nextInt();
		System.out.println(element);
		sc.close();
		
		linearSearch(arr,element);
	}

	public static void linearSearch(int[] arr, int element)
	{
		int flag = 2;
		int position = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				flag = 1;
				position = i;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("element found at position:- "+ position);
		}
		else
		{
			System.out.println("element not found");
		}
	}
}
