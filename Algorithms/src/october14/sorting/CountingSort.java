package october14.sorting;

public class CountingSort {

    public static int[] countingSort(int[] arr)
    {
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i:arr)
        {
            count[arr[i]]++;
        }
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return arr;
    }
}
