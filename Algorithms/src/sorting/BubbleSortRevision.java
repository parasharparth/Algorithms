package sorting;

import java.util.Scanner;

public class BubbleSortRevision {

	public static void main(String args[])
	{
		
		//the first step is to take the input
		int[] arr = input();
		
		//the second step is to call bubblesort function for sorting the elements
		arr = bubbleSort(arr);
		
		//The third step is to print the sorted array
		printArray(arr);
	}
	
	public static int[] input()
	{
		System.out.println("Please enter the number of elements you want to be swapped");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i = 0 ; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr)
	{

		for(int i = 0 ; i<arr.length-1; i++)
		{
			for(int j = 0; j<arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					//Swapping the elements
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is:- ");
		for(int i = 0 ; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
