package july07.sorting;

import july07.utils.Utils;

public class SelectionSort {

    public static void main(String[] args)
    {

        //The first step is to get the input array
        int[] arr = Utils.getArray();
        //The second step is to print the unsorted array
        Utils.printArray(arr,2);
        //The Third step is to call the selection sort function
        selectionSort(arr);
        //The fourth step is to print the sorted array
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
