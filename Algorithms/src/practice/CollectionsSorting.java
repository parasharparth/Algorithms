package practice;

import java.util.*;
import java.util.stream.Collectors;
public class CollectionsSorting {

	public static void main(String args[])
	{
		int[] arr = input();
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}
	
	public static int[] input()
	{
		System.out.println("Enter the number of elements you want to sort");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] arr = new int[number];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
}
