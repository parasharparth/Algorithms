package june17;

import java.util.Random;

/**************************************************************************
 * This is a linear non-optimized version of bubble sort
 * @author Parth Parashar
 *
 ***************************************************************************/
public class BubbleSorting {

	public static void main(String args[])
	{
		/***********************************************
		 * Generate a randomized array using random
		 ***********************************************/
		int[] result = bubbleSort(new Random().ints(10,0,10000).toArray());
		 
		/********************************
		 * Print the sorted array
		 *******************************/
		for(int i=0; i<result.length;i++)
		{
			System.out.print(result[i]+",");
		}
	} 
	 
	/****************************************************************************
	 * Bubble Sort function for sorting the array and returning the sorted array
	 ****************************************************************************/
	public static int[] bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{ 
				if(arr[j]> arr[j+1])
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
