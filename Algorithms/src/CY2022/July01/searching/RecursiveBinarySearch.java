package CY2022.July01.searching;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        int[] arr = {0,1,9,2,8,3,7,4,6,5};

        int result = binarySearch(arr,5,0,arr.length);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low <= high)
        {
            int middle = low + (high-low)/2;

            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return binarySearch(arr,element,low,middle-1);
            }
            else {
                return binarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }
}
