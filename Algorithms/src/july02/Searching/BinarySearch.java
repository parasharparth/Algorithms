package july02.Searching;

public class BinarySearch {
    public static void main(String args[])
    {
        //The first step is to get the input array
        int[] arr = {1,5,4,3,2,6,7,8,0,9};
        //The second step is to call the binary Search function
        int result = binarySearch(arr,5,0,arr.length-1);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }
    public static int binarySearch(int[] arr, int element, int low, int high) {
        while (low <= high)
        {
            int middle = low + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                low = middle -1;
            }
            else {
                high = middle + 1;
            }
        }
        return -1;
    }
}
