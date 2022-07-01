package june27.sorting;

import june27.utils.InputArray;
import june27.utils.PrintArray;

public class OptimizedBubbleSort {

    public static void main(String args[])
    {
        //step-1 is to get the input array
        int[] arr = InputArray.input();
        System.out.println("The unsorted array is: ");
        PrintArray.printArray(arr);
        System.out.println("The sorted array is: ");
        
    }
}
