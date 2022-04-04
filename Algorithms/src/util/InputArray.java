package util;

import java.util.*;
public class InputArray {

	public static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter");
		int number = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr = new int[number];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
}
