package practice;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String args[])
	{
		//The first step is to get the input array from the user
		int[] arr = InputArray.input();
		
		//The second step is to call the Arrays.sort method
		Arrays.sort(arr);
		
		DisplayArray.result(arr);
	}
}
