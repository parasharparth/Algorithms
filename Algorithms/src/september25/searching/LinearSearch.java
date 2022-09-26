package september25.searching;

import september25.utils.Utils;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),1);
        Utils.searchResult(linearSearch(Utils.getArray(), new Scanner(System.in).nextInt()));
    }

    public static int linearSearch(int[] arr, int element)
    {
        return -1;
    }
}
