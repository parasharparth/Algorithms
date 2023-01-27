package CY2022.july11.searching;

import CY2022.july11.utils.Utils;
import java.util.Arrays;

public class BinarySearch {
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
        while(low<=high)
        {
            int middle = low + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
