package sorting;

import java.util.*;

public class BubbleSorting {

	/********************************************************************************************************
	 * Main Class for calling other functions
	 * I will try to use as many user-defined methods as possible to make the program be divisible in parts 
	 * @param args
	 *******************************************************************************************************/
	public static void main(String args[])
	{
		
		//The first step is to call the input function to get the input elements
		//I will use arrays in this program to get the inputs
		int[] arr = getInput();
		
		if(arr.length < 10)
		{
			System.out.println("The number of elements are less than 10");
			System.exit(1);   //1 code is used when something went wrong
		}
		
		//The second step is to iterate the array and do swapping whenever required
		//This will also be put in a function
		arr = bubbleSort(arr);
		
		//The third step is to print the sorted array
		//Another function is call to print the array which will be a generic function in itself
		printArray(arr);
	}
	
	public static int[] getInput()
	{
		System.out.println("Enter 10 numbers that you want to sort in the ascending order");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0 ; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0 ; i<10; i++)
		{
			for(int j = 0; j<10-i-1; j++)
			{
				//here swapping will take place
	    		// swap arr[j+1] and arr[j]
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else
				{
					//nothing to be done and move to the next iteration of j
				}
			}
		}
		return arr;
	}
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is:- ");
		for(int i = 0; i< 10; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
