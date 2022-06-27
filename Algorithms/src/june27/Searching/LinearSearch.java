package june27.Searching;

import june27.utils.InputArray;
import june27.utils.PrintArray;

public class LinearSearch {
    public static void main(String args[])
    {
        //the first step is to input the array and print it
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);

        //The next step is to call the linearSearch fUnction
        int result = linearSearch(arr,5);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position"+result);
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
