package CY2022.october24.sorting;

public class QuickSort {

    public static int[] quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivot = partition(arr, low, high);
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
