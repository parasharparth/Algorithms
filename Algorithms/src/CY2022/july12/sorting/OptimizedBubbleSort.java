package CY2022.july12.sorting;

import CY2022.july12.utils.Utils;

public class OptimizedBubbleSort {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);
        bubbleSort(arr);
        Utils.printArray(arr,3);
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
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
