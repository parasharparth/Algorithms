package july10.Searching;

import july10.utils.Utils;

import java.util.Arrays;

public class BInarySearch {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);

        //The second step is to call the binary search function
        int result = binarySearch(arr,5,0,arr.length-1);

        //The third step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr,int element, int low,int high)
    {
        Arrays.sort(arr);
        while(low<=high)
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
