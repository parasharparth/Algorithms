package july07.Searching;

import july07.utils.Utils;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = Utils.getArray();

        //The second step is to print the array
        Utils.printArray(arr,1);

        //The third step is to call the binary Search function
        int result = binarySearch(arr,5,0,arr.length-1);

        //The fourth step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while (low<=high)
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
