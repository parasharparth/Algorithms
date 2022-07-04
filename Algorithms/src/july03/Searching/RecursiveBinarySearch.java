package july03.Searching;

import java.util.*;

public class RecursiveBinarySearch {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to call the recursive binary search function
        int result = recursiveBinarySearch(arr,5,0,arr.length-1);

        //The third step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found in the array at position: "+result);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        if(low<=high)
        {
            int middle = low + (high-low)/2;

            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return recursiveBinarySearch(arr,element,low,middle-1);
            }
            else {
                return recursiveBinarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }
}
