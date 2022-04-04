package practiceTest;

import util.DisplayArray;
import util.RandomisedArray;

public class SelectionSorting {

	public static void main(String args[])
	{
		DisplayArray.result(selectionSort(RandomisedArray.getRandomizedArray()));
	}
	
	public static int[] selectionSort(int[] arr)
	{
		//Here the sorting algorithm will loop on the array and compare all the elements to one another
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					//swapping to be done here
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
