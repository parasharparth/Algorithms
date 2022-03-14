package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {

	public static void main(String args[])
	{
		//The first step is to get the input array from the user
		int[] arr = input();
		
		//The second step is to call the Arrays.sort method
		Arrays.sort(arr);
		
		print(arr);
	}
	
	public static int[] input()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int number = sc.nextInt();
		int[] arr = new int[number];
		System.out.println("Kindly enter the elements of an array");
		for(int i = 0; i<number ;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void print(int[] arr)
	{
		System.out.println("The sorted array is:- ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
