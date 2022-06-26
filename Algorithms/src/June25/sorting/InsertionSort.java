package June25.sorting;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

public class InsertionSort {
    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        PrintArray.printArray(insertionSort(InputArray.input()));
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int key = arr[i];
            int j= i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
