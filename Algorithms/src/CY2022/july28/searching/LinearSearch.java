package CY2022.july28.searching;

import CY2022.july28.utils.Utils;

public class LinearSearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),1);
        Utils.searchResult(linearSearch(Utils.getArray(),5));
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
