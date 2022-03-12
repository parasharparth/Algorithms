package searching;

import java.util.*;
public class RecursiveBinarySearch {

	public static void main(String args[])
	{
		//The first step is to declare the array and then get the element to be searched from the user
		int[] arr = {1,2,3,4,5,6,8,7,9,0,10};
		
		//sorting the array
		Arrays.sort(arr);
		int element = input();
		
		//The second step is to call the recursive Binary Search method
		int left = 0;
		int right = arr.length - 1;
		int result = binarySearch(arr,element,left,right);
		if(result == (-1))
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index "+result);
		}
	}
	
	public static int binarySearch(int[] arr, int element, int left, int right)
	{
		if(right >= left)
		{
			int middle = left + (right-left)/2;
		
			//check if the middle element is equal to the element
			if(arr[middle] == element)
			{
				return middle;
			}
		
			if(arr[middle] > element)
			{
				return binarySearch(arr,element, left, middle-1);
			}
			else
			{
				return binarySearch(arr,element, middle+1, right);
			}
		}
		return -1;
		
	}
	
	public static int input()
	{
		System.out.println("Enter the element you want to search");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		sc.close();
		return element;
	}
}
