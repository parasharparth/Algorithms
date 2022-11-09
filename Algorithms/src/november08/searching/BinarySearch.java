package november08.searching;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        while(low <= high)
        {
            Arrays.sort(arr);
            int middle = low + (high - low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                high = middle -1;
            }
            else
            {
                low = middle + 1;
            }
        }
        return -1;
    }
}
