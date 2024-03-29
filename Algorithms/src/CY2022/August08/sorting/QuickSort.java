package CY2022.August08.sorting;

import CY2022.August08.utils.Utils;

public class QuickSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(quickSort(Utils.getArray(),0,Utils.getArray().length-1),3);
    }

    public static int[] quickSort(int[] arr, int low, int high)
    {
        if(low<high)
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
        int i = low - 1;
        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
