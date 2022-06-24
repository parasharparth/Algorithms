package june23;

public class OptimizedBubbleSorting {

    public static void main(String args[])
    {
        int[] arr = {2,5,3,1,4,7,0,9,8};
        int[] result = optimizedBubbleSorting(arr);
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] optimizedBubbleSorting(int[] arr)
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
