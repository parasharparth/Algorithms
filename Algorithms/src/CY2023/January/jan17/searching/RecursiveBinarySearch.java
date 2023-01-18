package CY2023.January.jan17.searching;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        if(low <= high)
        {
            int middle = low + (high - low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return binarySearch(arr, element, low, middle-1);
            }
            else
            {
                return binarySearch(arr, element, middle+1, high);
            }
        }
        return -1;
    }
}
