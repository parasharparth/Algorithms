package september26.sorting;

import september26.utils.Utils;

public class SelectionSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(optimizedSort(Utils.getArray()),3);
    }

    public static int[] optimizedSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int minimum_index = arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minimum_index] < arr[j])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
