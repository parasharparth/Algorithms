package CY2022.June22;

public class InsertionSorting {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};

        int[] result = insertionSorting(arr);

        System.out.println("The sorted array is:");
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] insertionSorting(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
