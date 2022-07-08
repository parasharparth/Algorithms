package july07.Searching;

import july07.utils.Utils;

public class LinearSearch {

    public static void main(String[] args)
    {
        //the first step is to get the input array
        int[] arr = Utils.getArray();

        //The second step is to print the array
        Utils.printArray(arr,1);

        //The third step is to call the linear search function
        int result = linearSearch(arr,5);

        //The fourth step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
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
