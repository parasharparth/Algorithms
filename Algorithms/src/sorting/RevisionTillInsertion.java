package sorting;

import java.util.*;
import java.util.stream.Collectors;

public class RevisionTillInsertion {

	/*****************************************************************************************************
	 * This Program is a revision program for selection sort, bubble sort and insertion sort
	 * Arrays.sort and Collections.sort are also used in separate functions to sort and print the array
	 ****************************************************************************************************/
	
	public static void main(String args[])
	{
		//The first step is to take the input from the user
		int[] arr = input();
		int[] arr_selection = Arrays.copyOf(arr, arr.length);;
		int[] arr_bubble = Arrays.copyOf(arr, arr.length);;
		int[] arr_insertion = Arrays.copyOf(arr, arr.length);;
		int[] arr_Arrays = Arrays.copyOf(arr, arr.length);;
		int[] arr_Collections = Arrays.copyOf(arr, arr.length);
		
		//The second step is to call the respective method and print the sorted arrays.
		System.out.println("ARRAYS.SORT() METHOD");
		Arrays.sort(arr_Arrays);
		printArray(arr_Arrays);
		
		System.out.println("COLLECTIONS.SORT() METHOD");
		List<Integer> list = Arrays.stream(arr_Collections).boxed().collect(Collectors.toList());
		Collections.sort(list);
		list.stream().forEach(System.out::println);
		
		System.out.println("SELECTION SORTING");
		printArray(selectionSort(arr_selection));
		
		System.out.println("BUBBLE SORTING");
		printArray(bubbleSort(arr_bubble));
		
		System.out.println("INSERTION SORTING");
		printArray(insertionSort(arr_insertion));
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] arr = new int[numberOfElements];
		System.out.println("Enter the elements");
		for(int i = 0 ; i < numberOfElements; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					//swapping takes place
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0 ; j< arr.length - i -1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static int[] insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length ; i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		return arr;
	}
}
