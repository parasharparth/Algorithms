package CY2022.June25.sorting;

import CY2022.June25.utils.InputArray;
import CY2022.June25.utils.Output;
import CY2022.June25.utils.PrintArray;

public class QuickSort {

    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        int[] arr = InputArray.input();
        PrintArray.printArray(quickSort(arr,0,arr.length-1));
    }

    public static int[] quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int initial = low-1;

        for(int i=low; i<high;i++)
        {
            if(arr[i] <= pivot)
            {
                initial++;
                int temp = arr[initial];
                arr[initial] = arr[i];
                arr[i] = temp;
            }
        }
        //swap the pivot element with the current value of initial which is greater than the pivot.
        int temp = arr[initial+1];
        arr[initial+1] = arr[high];
        arr[high] = temp;

        return initial+1;
    }
}
