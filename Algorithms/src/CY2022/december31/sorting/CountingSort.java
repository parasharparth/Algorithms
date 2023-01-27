package CY2022.december31.sorting;

import november03.utils.Utils;

public class CountingSort {

    public static int[] countingSort(int[] arr)
    {
        int[] count = new int[Utils.findMax(arr)+1];
        for(int i:arr)
        {
            count[arr[i]]++;
        }
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }
        int[] output = new int[arr.length];
        for(int i:arr)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }
}
