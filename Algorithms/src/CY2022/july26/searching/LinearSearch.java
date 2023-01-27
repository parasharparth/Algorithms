package CY2022.july26.searching;

import CY2022.july26.utils.Utils;
import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.searchResult(linearSearch(Utils.getArray(),5));
    }

    public static int linearSearch(int[] arr,int element)
    {
        //The first step is to convert the given array into arrayList
        ArrayList<Integer> list = Utils.convert(arr);
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) == element)
            {
                return i;
            }
        }
        return -1;
    }
}
