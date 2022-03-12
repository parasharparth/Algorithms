package sorting;

import java.util.*;
import java.util.stream.Collectors;
public class SelectionSorting {

	public static void main(String args[])
	{
		
		//the first step is to get the input from the user
		int[] arr = inputArray();
		
		int[] temp = Arrays.copyOf(arr, arr.length);
		
		//The next step is to call the selection sort method and print the sorted array
		printArray(SelectionSort(arr));
		
		//Sorting using the collections.sort
		List<Integer> list = Arrays.stream(temp).boxed().collect(Collectors.toList());
		System.out.println("The sorted list using collections.sort method is:- ");
		list.stream().forEach(System.out::println);
		
	}
	
	public static int[] inputArray()
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
	
	public static int[] SelectionSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			for(int j = i + 1; j< arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					//swapping the elements
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is:-");
		for(int i = 0 ; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
