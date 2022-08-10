package August08.sorting;

import August08.utils.Utils;

public class RadixSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(radixSort(Utils.getArray()),3);
    }

    public static int[] radixSort(int[] arr)
    {
        //The first step is to calculate the maximum element
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to call the counting sort
        for(int place = 1; max/place > 0; place*=10)
        {
            countingSort(arr,place);
        }

        return arr;
    }

    public static void countingSort(int[] arr, int place)
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        int[] count = new int[max+1];
        for(int i=0; i<count.length; i++)
        {
            count[i] = 0;
        }



        for(int i=0; i<arr.length; i++)
        {
            count[(arr[i]/place)%10]++;
        }

        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }

        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = output[i];
        }
    }
}
