package september05.searching;

import september05.utils.Utils;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args)
    {
        try {
            Utils.printArray(Utils.getArray(), 1);
            Utils.searchResult(linearSearch(Utils.getArray(), new Scanner(System.in).nextInt()));
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred , check input");
        }
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
