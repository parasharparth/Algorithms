package practice;

import java.util.*;
public class LinearSearch {

	public static void main(String args[])
	{
		int number = input();
		
		int[] arr = {1,2,7,4,6,88,33,56,78,100};
		linearSearch(arr, number);
	}
	
	@SuppressWarnings("resource")
	public static int input()
	{
		System.out.println("Enter the number you want to search");
		return new Scanner(System.in).nextInt();
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
