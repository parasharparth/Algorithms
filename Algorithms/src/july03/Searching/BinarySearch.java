package july03.Searching;

import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        //The first step is to get input array
        int[] arr = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //The second step is to call the binary search function
        int result = binarySearch(arr, 1,0, arr.length - 1);

        //The third step is to print the result
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at position: " + result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low<=high)
        {
            int middle = low + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            } else if (arr[middle] > element)
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
