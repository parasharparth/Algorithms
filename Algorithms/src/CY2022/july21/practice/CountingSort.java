package CY2022.july21.practice;

import CY2022.july21.utils.Utils;

public class CountingSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(countingSort(Utils.getArray()),3);
    }

    public static int[] countingSort(int[] arr)
    {
        //The first step is to find out the maximum element of the array
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }


        //The second step is to define and initialize the count array
        int[] count = new int[max+1];
        for(int i=0; i<arr.length;i++)
        {
            count[i] = 0;
        }

        //The third step is to populate the count array
        for (int j : arr) {
            count[j]++;
        }

        //The fourth step is to find the cumulative sum for the count array
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }

        //The fifth step is to calculate the index
        int[] output = new int[arr.length];
        for (int j : arr) {
            output[count[j] - 1] = j;
            count[j]--;
        }

        return output;
    }
}
