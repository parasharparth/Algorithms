package november17.sorting;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int middle = low + (high - low)/2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
        return arr;
    }

    public static void merge(int[] arr, int low, int middle , int high)
    {
        int length1 = middle - low + 1;
        int length2 = high - middle;
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

    }
}
