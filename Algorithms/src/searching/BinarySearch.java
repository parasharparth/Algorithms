package searching;

import java.util.*;

public class BinarySearch {

	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,89,10,11,12,13,14,15};
		
		//the first step is to get the integer from the user
		int element = input();
		
		//the second step is to call the binary search function and print the result onto the console.
		binarySearch(arr,element);
		
	}
	
	public static int input()
	{
		System.out.println("Enter the element you want to search");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		sc.close();
		return element;
	}
	
	public static void binarySearch(int[] arr, int element)
	{
		int left = 0;
		int right = arr.length-1;
		
		//Since binary search has to be performed on a sorted array(data),
		Arrays.sort(arr);
		System.out.println("The sorted array is; -");
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		while(left <= right)
		{
			//the first step is to calculate the middle element
			int middle = left + (right - left)/2;
			
			//the second step is to check whether the element is present at the middle element or not
			if(arr[middle] == element)
			{
				System.out.println("Element found at index:- "+ middle);
			}
		
			//the third step is to check whether element is greater than the middle element, and if so, ignore the left part completely.
			if(arr[middle] < element)
			{
				left = middle + 1;
			}
			else
			{
				right = middle - 1;
			}
		}
	}
}
