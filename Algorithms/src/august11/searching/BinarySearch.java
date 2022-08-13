package august11.searching;

import august11.utils.Utils;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.searchResult(binarySearch(Utils.getArray(),5,0,Utils.getArray().length-1));
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low < high)
        {
            int middle = low + (high - low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                high = middle - 1;
            }
            else {
                low = middle+1;
            }
        }
        return -1;
    }
}
