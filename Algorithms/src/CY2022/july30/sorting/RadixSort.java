package CY2022.july30.sorting;

import CY2022.july30.utils.Utils;

public class RadixSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(radixSort(Utils.getArray()),3);
    }

    public static int[] radixSort(int[] arr)
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        for(int place = 1; max/place>0 ; place*=10)
        {
            countingSort(arr,place);
        }
        return arr;
    }

    public static void countingSort(int[] arr, int place)
    {
        
    }
}
