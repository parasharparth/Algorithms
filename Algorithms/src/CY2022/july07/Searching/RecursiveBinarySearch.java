package CY2022.july07.Searching;

import CY2022.july07.utils.Utils;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = Utils.getArray();

        //The second step is to print the given array
        Utils.printArray(arr,1);

        //The third step is to call the binarySearch function
        int result = binarySearch(arr,5,0,arr.length-1);

        //The fourth step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found in the array");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        if(low<=high)
        {
            int middle = low + (high - low)/2;

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
