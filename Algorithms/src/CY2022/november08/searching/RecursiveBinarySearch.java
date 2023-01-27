package CY2022.november08.searching;

public class RecursiveBinarySearch {

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        if(low <= high)
        {
            int middle = low + (high - low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return binarySearch(arr, element, low, middle - 1);
            }
            else
            {
                return binarySearch(arr, element, middle + 1, high);
            }
        }
        return -1;
    }
}
