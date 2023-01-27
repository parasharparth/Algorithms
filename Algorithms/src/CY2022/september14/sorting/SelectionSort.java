package CY2022.september14.sorting;

import CY2022.september14.utils.Utils;

public class SelectionSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(selectionSort(Utils.getArray()),3);
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minimum_index] > arr[j])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum_index];
            arr[minimum_index] = temp;
        }
        return arr;
    }
}
