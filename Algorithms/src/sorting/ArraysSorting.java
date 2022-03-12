package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {

	public static void main(String args[])
	{
		
		
		//Step-1 is to get the input from the user
		int[] arr = input();
		
		//Step-2 is to sort the array using Arrays.sort;
		
		Arrays.sort(arr);
		
		printArray(arr);
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is:- ");
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
