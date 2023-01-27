package CY2022.july09.searching;

import CY2022.july07.utils.Utils;

public class LinearSearch {

    public static void main(String[] arg)
    {
        //The first step is to get the input array and print it
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);
        //The second step is to call the linear search function
        int result = linearSearch(arr,5);
        //The third step is to print the final; result
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
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
