package july09.sorting;

import july07.utils.Utils;

public class SelectionSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array and print the unsorted array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);

        //The second step is to call the selection sort
        selectionSort(arr);

        //The third step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[minimum_index])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum_index];
            arr[minimum_index] = temp;
        }
    }
}
