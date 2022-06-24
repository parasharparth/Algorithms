package june23;

import java.util.*;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};

        Arrays.sort(arr);

        System.out.println("the sorted array is:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        int result = binarySearch(arr, 5, 0, arr.length);

        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else
        {
            System.out.println("Element found in the array at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        while(low <= high)
        {
            int middle = low + (high-low)/2;

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
