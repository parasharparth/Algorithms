package CY2022.Jun20;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,4,6,2,3,7,8,9};
        int result = binarySearch(arr,8,0,arr.length-1);
        if(result == -1)
        {
            System.out.println("The number is not found");
        }
        else
        {
            System.out.println("Resultant index is: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low <= high)
        {
            int middle = low + (high-low)/2;

            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle]> element)
            {
                high = middle -1;
            }
            else
            {
                low = middle+1;
            }
        }
        return -1;
    }
}
