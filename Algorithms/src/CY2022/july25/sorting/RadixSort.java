package CY2022.july25.sorting;

import CY2022.july25.utils.Utils;

public class RadixSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(radixSort(Utils.getArray()),3);
    }

    public static int[] radixSort(int[] arr)
    {
        //The first step is to calculate the maximum element of the array
        int max = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The next step is to call the counting sort
        for(int place = 1; max/place>0 ; place*=10)
        {
            countingSort(arr,place);
        }
        return arr;
    }

    public static void countingSort(int[] arr, int place)
    {
        //The first step is to find the maximum element from the given array
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to initialize the count array
        int[] count = new int[max+1];
        for(int i=0; i<count.length; i++)
        {
            count[i] = 0;
        }

        //the third step is to populate the count array
        for(int i=0; i<arr.length;i++)
        {
            count[(arr[i]/place)%10]++;
        }

        //the fourth step is to calculate the cumulative sum in the count array
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }

        //The fifth step is to sort using the index and count
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            output[count[(arr[i]/place)%10] -1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        //copying the output in the given array and returning it back to function
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = count[i];
        }

    }
}
