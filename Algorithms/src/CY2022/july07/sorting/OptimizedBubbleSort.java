package CY2022.july07.sorting;

import CY2022.july07.utils.Utils;

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
        for(int i=0; i< arr.length-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
    }
}
