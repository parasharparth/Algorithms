package practice;

import java.util.*;
public class InsertionSorting {

	public static void main(String args[])
	{
		int[] arr = input();
		
		insertionSort(arr);
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements you want to sort");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr = new int[number];
		for(int i=0;i<number; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void insertionSort(int[] arr)
	{
		
	}
}
