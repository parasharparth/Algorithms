package June25.sorting;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

public class SelectionSort {

    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        PrintArray.printArray(selectionSort(InputArray.input()));
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            int mimimum_index = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[mimimum_index])
                {
                    mimimum_index = j;
                }
            }
            int temp = arr[mimimum_index];
            arr[mimimum_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
