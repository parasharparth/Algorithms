package June21;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = {1,4,3,2,6,7,5,9,0,-1};
        int result = binarySearch(arr,3,0,arr.length);

        if(result == -1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        while(low<=high)
        {
            int middle = low+(high-low)/2;

            if(arr[middle]==element)
            {
                return middle;
            }
            else if(arr[middle] < element)
            {
                low = middle + 1;
            }
            else
            {
                high = middle - 1;
            }
        }
        return -1;
    }
}
