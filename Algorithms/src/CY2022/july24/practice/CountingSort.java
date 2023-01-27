package CY2022.july24.practice;

import CY2022.july24.utils.Utils;

public class CountingSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(countingSort(Utils.getArray()),3);
    }

    public static int[] countingSort(int[] arr)
    {
        //The first step is to get the maximum element from the array
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //the second step is to define the count array
        int[] count = new int[max+1];
        for(int i=0; i< count.length; i++)
        {
            count[i] = 0;
        }

        //The third step is to populate the count array
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        //The fourth step is to find the cumulative sum
        for(int i=1; i<count.length; i++)
        {
            count[i] += count[i-1];
        }

        //The fifth step is to sort the array according to the indexes
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length; i++)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }
}
