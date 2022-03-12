package sorting;

import java.util.*;
import java.util.stream.Collectors;
public class Sortingbubblepractice {

	public static void main(String args[])
	{
		//step-1 is to take input from the user
		int[] arr = inputArray();
		
		//Second step is to use the bubblesort method to sort the array and print the sorted array
		int[] temp = Arrays.copyOf(arr, arr.length);
		printArray(bubbleSort(temp));
		
		//Third step is to sort using Arrays.sort method
		int[] temp1 = arr;
		System.out.println("Sorting using the Arrays.sort() method");
		Arrays.sort(temp1);
		printArray(temp1);
		
		//Fourth step is to collections
		collectionsSorting(arr);
	}
	
	public static int[] inputArray()
	{
		System.out.println("Enter the number of elements: -");
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		
		int[] arr = new int[numberOfElements];
		System.out.println("Enter the elements: -");
		for(int i = 0 ; i< numberOfElements; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		System.out.println("Sorting using the bubble sort method");
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0 ; j< arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("The sorted array is:- ");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void collectionsSorting(int[] arr)
	{
		
		//The first step is to convert the array in a list
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//the second step is to use the collections.sort method
		Collections.sort(list);
		
		//the third step is to print the sorted list
		System.out.println("Sorted array using collection classes is: -");
		
		list.stream().forEach(System.out::println);
		
		
	}
	
}
