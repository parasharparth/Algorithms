package June25.searching;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        Output.output("The given Array is: ");
        PrintArray.printArray(InputArray.input());
        int result = recursiveBinarySearch(InputArray.input(),5,0,InputArray.input().length);
        if(result == -1)
            Output.output("Element not found");
        else
            Output.output("Element found at position: ",result);
    }

    public static int recursiveBinarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low <= high)
        {
            int middle = low + (high - low)/2;
            if(arr[middle] == element)
                return middle;
            else if(arr[middle] > element)
                return recursiveBinarySearch(arr,element,low,middle-1);
            else
                return recursiveBinarySearch(arr,element,middle+1,high);
        }
        return -1;
    }
}
