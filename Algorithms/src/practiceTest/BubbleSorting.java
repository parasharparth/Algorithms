package practiceTest;

import util.DisplayArray;
import util.RandomisedArray;

public class BubbleSorting {
	
	public static void main(String args[])
	{
		DisplayArray.result(bubbleSort(RandomisedArray.getRandomizedArray()));
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		//This is the simplest sorting algorithm where adjacent elements are repeatedly compared
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])   //here the change of sign will sort in opposite order
				{
					//swapping takes place here
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
