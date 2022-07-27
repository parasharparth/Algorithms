package july26.sorting;

import july26.utils.Utils;

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
            quickSort(arr,pivot+1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high)
    {
        return 1;
    }

}
