package June19;

import java.util.*;

public class BubbleSorting {

    public static void main(String args[])
    {
        int[] arr = bubbleSort(new Random().ints(10,0,1000).toArray());
        for(int i=0; i<arr.length;i++)
        System.out.print(arr[i]+",");
    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
