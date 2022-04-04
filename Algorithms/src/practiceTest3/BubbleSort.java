package practiceTest3;

import util.DisplayArray;
import util.RandomisedArray;

public class BubbleSort {

	public static void main(String args[])
	{
		//The first step is to get the randomised array.
		int[] arr = RandomisedArray.getRandomizedArray();
		
		//Display the Array
		DisplayArray.result(arr);
		
		//Call the bubble sort
		int[] result = bubbleSorting(arr);
		
		//Display the sorted array
		DisplayArray.result(result);
	}
	
	public static int[] bubbleSorting(int[] arr)
	{
		//Here elements are compared in pairs and then the iterator moves forward until the end condition is reached
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					//swap the numbers
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
