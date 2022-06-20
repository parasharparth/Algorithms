package June19;

import java.util.Random;

public class LinearSearch {

    public static void main(String[] args)
    {
        int result = linearSearch(new Random().ints(10,0,1000).toArray(),10);

        if(result == -1)
            System.out.println("element is not found in the given array");
        else
            System.out.println("The element is found at position at: "+result);
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+",");

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
