package june27.Searching;

import june27.utils.InputArray;
import june27.utils.PrintArray;

public class BinarySearch {

    public static void main(String args[])
    {
        //step-1 is to make the input array
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);

        //Step-2 is to call the binary Search function
        int result = binarySearch(arr,6,0,arr.length-1);
        if(result == -1)
        {
            System.out.println("Element not found in the array");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr,int element, int low, int high)
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
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
