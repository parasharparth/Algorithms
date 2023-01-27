package CY2022.June25.searching;

import CY2022.June25.utils.InputArray;
import CY2022.June25.utils.Output;
import CY2022.June25.utils.PrintArray;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[])
    {
        Output.output("The given Array is: ");
        PrintArray.printArray(InputArray.input());
        int result = binarySearch(InputArray.input(),5,0,InputArray.input().length);
        if(result == -1)
        {
            Output.output("Element not found");
        }
        else {
            Output.output("Element found at position: ",result);
        }
    }

    public static int binarySearch(int[] arr,int element, int low, int high)
    {
        Arrays.sort(arr);
        Output.output("The sorted array is: ");
        PrintArray.printArray(arr);
        while(low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == element) {
                return middle;
            } else if (arr[middle] > element) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}

