package july15.sorting;

import july15.utils.Utils;

public class quickSort {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);
        quickSort(arr,0,arr.length-1);
        Utils.printArray(arr,3);
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}
