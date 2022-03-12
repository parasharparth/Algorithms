package sorting;

import java.util.*;
import java.util.stream.Collectors;
public class InsertionSorting {

	public static void main(String args[])
	{
		//The first step is to get the input from the user
		int[] arr = inputArray();
		
		int[] temp = Arrays.copyOf(arr, arr.length);
		//the second step is to call the insertion sort method and print it
		printArray(insertionSort(arr));
		
		//The third step is to use the collections api to sort the array.
		List<Integer> list = Arrays.stream(temp).boxed().collect(Collectors.toList());
		System.out.println("Printing the sorted temporary array using Streams API:- ");
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}
	
	public static int[] insertionSort(int[] arr)
	{
		for(int i = 1; i< arr.length; i++)  //here i is starting from 1 because we have assumed that the first item is in the correct place.
		{
			int current = arr[i];
			int j = i -1;
			
			//The process of shifting the elements with respect to the key
			// This loops works to the left of the current item.
			while(j>=0 && arr[j] > current)
			{
				//the process of moving to the right takes place here.
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		return arr;
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
	
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is: -");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
