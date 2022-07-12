package july12.searching;

import july12.utils.Utils;

public class LinearSearch {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        Utils.printArray(arr,1);
        int result = linearSearch(arr,5);
        Utils.searchResult(result);
    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
