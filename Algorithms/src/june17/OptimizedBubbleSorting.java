package june17;

import java.util.Random;

/*********************************************************************
 * Optimized Bubble sort 
 * It uses a flag to decrease then number of iterations
 * It is used to decrease the number of swaps as well
 * @author Parth Parashar
 *********************************************************************/
public class OptimizedBubbleSorting {

	public static void main(String[] args)
	{
		
		/*************************************
		 * Calling bubble sort function
		 *************************************/
		int[] arr = optimizedBubbleSorting(new Random().ints(10,0,10000).toArray());
		
		
		/*******************************************
		 * Printing the final result
		 *******************************************/
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	public static int[] optimizedBubbleSorting(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			boolean swapped = false;
			for(int j=0;j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false)
			{
				break;
			}
		}
		return arr;
	}
}
