package july09.sorting;

import july07.utils.Utils;

public class QuickSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array and print the unsorted array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);

        //The second step is to call the quick sort function
        quickSort(arr,0,arr.length-1);

        //The third step is to print the sorted array
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
