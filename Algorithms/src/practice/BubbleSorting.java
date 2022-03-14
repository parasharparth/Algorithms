package practice;

import java.util.*;

public class BubbleSorting {

	public static void main(String args[])
	{
		//the first step is to get the input from the user
		int[] arr = input();
		
		//The second step is to call the bubble sort method
		bubbleSort(arr);
	}
	
	public static int[] input()
	{
		System.out.println("ENter the number of elements");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr = new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j =0;j<arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					//swapping will take place
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is:- ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
