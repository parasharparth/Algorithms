package practice;

import util.DisplayArray;
import util.InputArray;

public class SelectionSorting {

	public static void main(String args[])
	{
		//the first step is to get the input array from the user
		int[] arr = InputArray.input();
		
		//The second step is to perform the selection sort by calling the selection sort method 
		selectionSort(arr);
		
		//The third step is to display the sorted array
		DisplayArray.result(arr);
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					//swap the numbers
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
