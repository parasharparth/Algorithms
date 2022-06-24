package june23;

import java.util.Arrays;
public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};
        Arrays.sort(arr);
        int result = recursiveBinarySearch(arr,5,0,arr.length);

        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found at position: "+ result);
        }
    }

    public static int recursiveBinarySearch(int[] arr,int element, int low, int high)
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
                return recursiveBinarySearch(arr,element,low,middle-1);
            }
            else {
                return recursiveBinarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }
}
