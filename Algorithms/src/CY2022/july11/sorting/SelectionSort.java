package CY2022.july11.sorting;

import CY2022.july07.utils.Utils;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);
        selectionSort(arr);
        Utils.printArray(arr,3);
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[minimum_index])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
    }
}
