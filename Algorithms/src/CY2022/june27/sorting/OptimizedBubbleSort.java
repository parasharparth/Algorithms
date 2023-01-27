package CY2022.june27.sorting;

import CY2022.june27.utils.InputArray;
import CY2022.june27.utils.PrintArray;

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
