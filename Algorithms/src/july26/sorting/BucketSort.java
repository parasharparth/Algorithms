package july26.sorting;

import july26.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(bucketSort(Utils.getArray()),3);
    }

    public static int[] bucketSort(int[] arr)
    {
        if(arr.length<=0)
        {
            System.exit(0);
        }

        //The first step is to create the buckets and since we are using java-8, we will use an array list
        ArrayList<Integer>[] buckets = new ArrayList[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            buckets[i] = new ArrayList<Integer>();
        }

        //The second step is to add elements to the buckets
        for(int i=0; i<arr.length; i++)
        {
            int bucketIndex = (int) arr[i] * arr.length;
            buckets[bucketIndex].add(arr[i]);
        }

        //The third step is to sort the elements in each bucket
        for(int i=0; i<arr.length; i++)
        {
            Collections.sort(buckets[i]);
        }

        //The fourth step is to get the sorted elements from the buckets to the array
        int index = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0, size = buckets[i].size(); j<size; j++)
            {
                arr[index++] = buckets[i].get(j);
            }
        }
        return arr;
    }
}
