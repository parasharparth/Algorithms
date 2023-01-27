package CY2022.july10.Searching;

import CY2022.july10.utils.Utils;
import java.util.*;

public class RecursiveBinarySearch {

    public static void main(String[] args)
    {
        //the first step is to get the input array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);

        //the second step is to call the function
        int result = recursiveBinarySearch(arr, 5, 0, arr.length-1);

        //The third step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else{
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
