package CY2022.Jun20;

public class SelectionSort {

    public static void main(String args[])
    {
        int[] arr = {9,5,1,2,8,6,3,4,7};
        int[] result = selectionSorting(arr);

        System.out.println("The sorted array is:");
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] selectionSorting(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[minimum_index])
                {
                    minimum_index = j;
                }
            }

            //swapping to take place here
            int temp = arr[i];
            arr[i] = arr[minimum_index];
            arr[minimum_index] = temp;
        }
        return arr;
    }
}
