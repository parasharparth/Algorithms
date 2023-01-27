package CY2022.july24.practice;

import CY2022.july24.utils.Utils;

public class RadixSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(radixSort(Utils.getArray()),3);
    }

    public static int[] radixSort(int[] arr)
    {
        //The first step is to find the maximum element
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        //The second step is to call the counting sort function according to places
        for(int place = 1; max/place > 0; place*=10)
        {
            countingSort(arr,place);
        }
        return arr;
    }

    public static void countingSort(int[] arr,int place)
    {
        //The first step is to find the maximum for this place value
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to define the count array
        int[] count = new int[max+1];
        for(int i=0; i<count.length; i++)
        {
            count[i] = 0;
        }

        //The third step is to put elements in the count array
        for(int i=0; i<count.length; i++)
        {
            count[(arr[i]/place)%10]++;
        }

        //The fourth step is to find the cumulative sum in the count array
        for(int i=1; i<count.length; i++)
        {
            count[i] += count[i-1];
        }

        //The fifth step is to sort according to index
        int[] output = new int[arr.length];
        for(int i=0;i<arr.length; i++)
        {
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        //The last step is to copy the output array to the main array
        for(int i=0; i<arr.length ; i++)
        {
            arr[i] = output[i];
        }
    }
}
