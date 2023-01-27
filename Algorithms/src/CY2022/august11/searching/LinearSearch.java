package CY2022.august11.searching;

import CY2022.august11.utils.Utils;

public class LinearSearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.searchResult(linearSearch(Utils.getArray(),5));
    }

    public static int linearSearch(int[] arr,int element)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[i] == element)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
