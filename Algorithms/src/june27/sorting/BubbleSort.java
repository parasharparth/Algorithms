package june27.sorting;

import june27.utils.InputArray;
import june27.utils.PrintArray;

public class BubbleSort {
    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("The unsorted array is: -");
        PrintArray.printArray(arr);

        System.out.println("The sorted array is: ");
        PrintArray.printArray(bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
