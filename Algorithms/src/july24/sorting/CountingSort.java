package july24.sorting;

import july24.utils.Utils;

public class CountingSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(countingSort(Utils.getArray()),3);
    }

    public static int[] countingSort(int[] arr)
    {
        //The first step is to find the maximum value
        int max = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to declare the count array and initialize it
        int[] count = new int[max+1];
        for(int i=0; i<count.length;i++)
        {
            count[i] = 0;
        }

        //The third step is to populate the count array
        for(int i=0; i< arr.length;i++)
        {
            count[arr[i]]++;
        }

        //the fourth step is to calculate the cumulative sum
        for(int i=1; i<count.length; i++)
        {
            count[i] += count[i-1];
        }

        //The fifth step is to do the sorting
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }
}
