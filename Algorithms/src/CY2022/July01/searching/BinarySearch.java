package CY2022.July01.searching;

import java.util.*;

public class BinarySearch {

    public static void main(String args[])
    {
        //The first step is to get the array
        int[] arr = {1,5,4,2,3,6,7,9,0};

        //The second step is to call the binary search
        int result = binarySearch(arr,5,0,arr.length);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+ result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low <= high)
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
                low = middle + 1;
            }
        }
        return -1;
    }
}
