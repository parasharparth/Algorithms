package August08.sorting;

import August08.utils.Utils;

public class CountingSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(countingSort(Utils.getArray()),3);
    }

    public static int[] countingSort(int[] arr)
    {
        //The first step is to calculate the maximum element of the array
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to initiate the count array
        int[] count = new int[max+1];
        for(int i=0; i<count.length; i++)
        {
            count[i] = 0;
        }
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        //The third step is to calculate the cumulative sum
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }

        //the fourth step is to calculate the output array
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }
}
