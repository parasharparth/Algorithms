package June19;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = {8,4,6,2,9,1,0,3,5,7};
        int result = binarySearch(arr,5,0,arr.length-1);
        if(result == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println(result);
        }
    }

    public static int binarySearch(int[] arr, int element,int low,int high)
    {
        Arrays.sort(arr);
        while(low<=high) {
            int middle = low + (high - low) / 2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(element < arr[middle])
            {
                //move to the left
                low = middle+1;
            }
            else
            {
                high = middle-1;
            }
        }
        return -1;
    }
}
