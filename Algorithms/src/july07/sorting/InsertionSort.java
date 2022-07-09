package july07.sorting;

import july07.utils.Utils;

public class InsertionSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = Utils.getArray();

        //The second step is to print the unsorted array
        Utils.printArray(arr,2);

        //The third step is to call the insertion sort function
        insertionSort(arr);

        //The fourth step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
