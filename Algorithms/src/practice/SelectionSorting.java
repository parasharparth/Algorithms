package practice;

import java.util.*;
public class SelectionSorting {

	public static void main(String args[])
	{
		//the first step is to get the input array from the user
		int[] arr = input();
		
		//The second step is to perform the selection sort by calling the selection sort method 
		selectionSort(arr);
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements of the array");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the array that you want to sort");
		int[] arr = new int[number];
		for(int i = 0; i<number; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					//swap the numbers
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted array is: -");
		//printing the sorted array
		for(int i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
