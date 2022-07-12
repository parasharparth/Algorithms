package july12.searching;

import july12.utils.Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);
        int result = binarySearch(arr,5,0,arr.length-1);
        Utils.searchResult(result);
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        if(low <= high)
        {
            int middle = low + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if (arr[middle] > element)
            {
                return binarySearch(arr,element,low,middle-1);
            }
            else
            {
                return binarySearch(arr,element,middle+1, high);
            }
        }
        return -1;
    }
}
