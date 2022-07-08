package july07.sorting;

import july07.utils.Utils;

public class OptimizedBubbleSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = Utils.getArray();

        //The second step is to print the unsorted array
        Utils.printArray(arr,2);


        //The third step is to call the bubbleSort function
        bubbleSort(arr);

        //The fourth step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void bubbleSort(int[] arr)
    {

    }
}
