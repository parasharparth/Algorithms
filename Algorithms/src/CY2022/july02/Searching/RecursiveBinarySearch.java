package CY2022.july02.Searching;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        //the first step is to get the input array
        int[] arr = {1,6,5,4,3,2,9,0,8,7};

        //The second step is to call the recursive binary search function
        int result = recursiveBinarySearch(arr,0,0,arr.length-1);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
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
