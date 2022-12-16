package december16.sorting;

import december16.utils.Utils;

public class RadixSort {

    public static int[] radixSort(int[] arr)
    {
        for(int place = 1; Utils.findMax(arr)/place>0 ; place*=10)
        {
            countingSort(arr,place);
        }
        return arr;
    }

    public static int[] countingSort(int[] arr, int place)
    {
        int[] count = new int[Utils.findMax(arr)+1];
        for(int i:arr)
        {
            count[(arr[i]/place)%10]++;
        }
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }
        int[] output = new int[arr.length];
        for(int i:arr)
        {
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i:output)
        {
            arr[i] = output[i];
        }
        return arr;
    }
}
