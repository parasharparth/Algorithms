package july09.sorting;

import july07.utils.Utils;

public class InsertionSort {

    public static void main(String[] args)
    {
        //The first step is get the input array and print the unsorted array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);

        //The second step is to call the insertion sort function
        insertionSort(arr);

        //The third step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
