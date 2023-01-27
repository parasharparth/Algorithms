package CY2022.June22;

public class BubbleSort {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};

        int[] result = bubbleSorting(arr);

        System.out.println("The sorted array is:");
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] bubbleSorting(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
