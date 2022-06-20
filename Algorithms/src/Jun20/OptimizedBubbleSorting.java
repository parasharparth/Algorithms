package Jun20;

public class OptimizedBubbleSorting {

    public static void main(String args[])
    {
        int[] arr = {2,3,1,8,4,5,9,0};
        int[] result = optimizedBubbleSort(arr);

        System.out.println("The sorted array is: ");
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] optimizedBubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
        return arr;
    }

}
