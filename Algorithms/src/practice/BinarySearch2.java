package practice;

import java.util.*;
public class BinarySearch2 {

	public static void main(String args[])
	{
		int number = input();
		int[] arr = {1,2,3,4,6,7,8,9,0,33,567,877,344,555};
		binarySearch(arr,number);
	}
	
	@SuppressWarnings("resource")
	public static int input()
	{
		System.out.println("Enter the number you want to search");
		return new Scanner(System.in).nextInt();
	}
	
	public static void binarySearch(int[] arr, int number)
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int middle = left + (right-left)/2;
			
			if(arr[middle] == number)
			{
				System.out.println("The element is found at the position: -"+(int)(middle+1));
				System.exit(0);
			}
			else if(arr[middle] > number)
			{
				right = middle-1;
			}
			else
			{
				left = middle+1;
			}
		}
		
		System.out.println("Number is not present in this array");
	}
}
