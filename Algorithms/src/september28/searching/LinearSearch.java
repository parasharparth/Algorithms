package september28.searching;

import september28.utils.Utils;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),1);
        Utils.searchResult(linearSearch(Utils.getArray(), new Scanner(System.in).nextInt()));
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
