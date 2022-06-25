package June25.searching;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

public class LinearSearch {

    public static void main(String args[])
    {
        System.out.println("The given array is: ");
        PrintArray.printArray(InputArray.input());
        int result = linearSearch(InputArray.input(),5);
        if(result == -1)
        {
            Output.output("Element not found");
        }
        else {
            Output.output("Element found at position",result);
        }
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
