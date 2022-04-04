package practice;

import util.DisplayArray;
import util.InputArray;

public class InsertionSorting2 {

	public static void main(String args[])
	{
		DisplayArray.result(insertionSort(InputArray.input()));
	}
	
	public static int[] insertionSort(int[] arr)
	{
		for(int i=1; i<arr.length;++i)
		{
			int j=i-1;
			int key = arr[i];
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
