package CY2022.June22;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};

        Arrays.sort(arr);

        System.out.println("The sorted array is:");

        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+",");

        System.out.println();

        int result = recursiveBinarySearch(arr,5,0,arr.length-1);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int element, int low, int high)
    {
        int middle = low + (high-low)/2;
        while(low <= high)
        {
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return recursiveBinarySearch(arr,element,0,middle-1);
            }
            else
            {
                return recursiveBinarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }

}
