package CY2022.october12.sorting;

public class RadixSort {

    public static int[] radixSort(int[] arr)
    {
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max > arr[i])
            {
                arr[i] = max;
            }
        }

        for(int place = 1; max/place>0; place*=10)
        {
            countingSort(arr,place);
        }
        return arr;
    }

    public static void countingSort(int[] arr, int place)
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
            count[(arr[i]/place)%10]++;
        }
        for(int i=1; i<arr.length; i++)
        {
            count[i] += count[i-1];
        }

        int[] output = new int[arr.length];
        for(int i:arr)
        {
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i:arr)
        {
            arr[i] = output[i];
        }
    }
}
