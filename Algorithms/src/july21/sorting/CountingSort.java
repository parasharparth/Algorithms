package july21.sorting;

import july21.utils.Utils;

public class CountingSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(countingSort(Utils.getArray()),3);
    }

    public static int[] countingSort(int[] arr)
    {
        //Think in steps
        //The first step is to find the maximum element of the array
        int max = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //The second step is to define the count array and initialize it with "0" elements
        int[] count = new int[max+1];
        for(int i=0; i<arr.length;i++)
        {
            count[i] = 0;
        }

        //Then fill the count array with the elements
        for(int i=0; i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        //The third step is to calculate the cumulative sum in the count array
        for(int i=1; i<arr.length;i++)
        {
            count[i] += count[i-1];
        }

        //the last step is to find the index of each element and then according to the count, place it the new array
        int[] output = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]-- ;
        }

//        //Copy the new array into the input array
//        for(int i=0; i<arr.length; i++)
//        {
//            output[i] = arr[i];
//        }

        return output;
    }
}
