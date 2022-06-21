package June21;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,4,3,2,6,7,5,9,0,-1};
        int result = recursiveBinarySearch(arr,1,0,arr.length);

        if(result == -1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        if(low<=high)
        {
            int middle = low + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return recursiveBinarySearch(arr,element,low,middle-1);
            }
            else
            {
                return recursiveBinarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }
}
