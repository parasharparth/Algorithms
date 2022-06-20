package Jun20;

import java.util.Arrays;

public class BinarySearchRecursive {

    public static void main(String[] args)
    {
        int[] arr = {1,4,6,2,3,7,8,9};
        int result = recursiveBinarySearch(arr, 8 , 0, arr.length-1);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index: "+result);
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
                recursiveBinarySearch(arr,element,low,middle-1);
            }
            else
            {
                recursiveBinarySearch(arr,element,middle+1, high);
            }
        }
        return -1;
    }
}

