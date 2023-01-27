package CY2022.july23.sorting;

import CY2022.july22.utils.Utils;

public class RadixSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(radixSort(Utils.getArray()),3);
    }

    public static int[] radixSort(int[] arr)
    {
        //The first step is to get the maximum number from the array
        int max = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //the second step is to apply the counting sort to elements according to their place values
        return arr;
    }
}
