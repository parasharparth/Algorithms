package july04.Sorting;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        System.out.println("The unsorted array is :");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
