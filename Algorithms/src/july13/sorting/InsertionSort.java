package july13.sorting;

import july13.utils.Utils;

public class InsertionSort {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);
        insertionSort(arr);
        Utils.printArray(arr,3);
    }

    public static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
