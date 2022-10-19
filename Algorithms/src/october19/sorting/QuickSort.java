package october19.sorting;

public class QuickSort {

    public static int[] quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int i = low - 1;
        int pivot = arr[high];
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
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}
