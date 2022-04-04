package practiceTest3;

import util.DisplayArray;
import util.RandomisedArray;

public class SelectionSort {

	public static void main(String args[])
	{
		//The first step is to get the randomized array
		int[] arr = RandomisedArray.getRandomizedArray();
		
		//The second step is to call the selectionSorting method
		int[] result = selectionSorting(arr);
		
		//The third step is to display the sorted array
		DisplayArray.result(result);
	}
	
	public static int[] selectionSorting(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					//swap the elements
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}
