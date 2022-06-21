package June21;

public class OptimizedBubbleSorting {

    public static void main(String args[])
    {
        int[] arr= {1,8,6,3,2,4,5,7};
        int[] result = optimizedBubbleSort(arr);

        System.out.println("The sorted array is: -");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] optimizedBubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1;j++)
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
