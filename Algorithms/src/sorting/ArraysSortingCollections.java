package sorting;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysSortingCollections {

	public static void main(String args[])
	{
		//Step-1 is to take the input from the user
		int[] arr = input();
		
		//Step-2 is to use the Collections.sort to sort the array
		//Collections.sort();  --> throws an error because collections don't arrays
		//Use Arrays.sort as it is used for arrays
		//or we can use the stream API to convert it to the ArrayList and then use collections.sort
	
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		
		//Step-3 is to print the list
		list.stream().forEach(System.out::println);
		
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] arr = new int[numberOfElements];
		
		System.out.println("Enter the elements:- ");
		for(int i = 0 ; i< numberOfElements; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
		
	}
}
