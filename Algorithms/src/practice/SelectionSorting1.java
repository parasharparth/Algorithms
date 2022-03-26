package practice;

import java.util.Random;
public class SelectionSorting1 {
	
	public static void main(String args[])
	{
		DisplayArray.result(selectionSort(new Random().ints(10,10,1000).toArray()));
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
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
