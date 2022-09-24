package september23.sorting;

import september23.utils.Utils;

public class OptimizedSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(optimizedSort(Utils.getArray()),3);
    }

    public static int[] optimizedSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return arr;
    }
}
