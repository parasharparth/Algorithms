package October01.searching;

import October01.utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),1);
        Utils.searchResult(binarySearch(Utils.getArray(), new Scanner(System.in).nextInt(), 0, Utils.getArray().length-1));
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        Arrays.sort(arr);
        while(low<=high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == element) {
                return middle;
            }
            else if (arr[middle] < element)
            {
                return binarySearch(arr, element, middle + 1, high);
            }
            else
            {
                return binarySearch(arr, element, low, middle - 1);
            }
        }
        return -1;
    }
}
