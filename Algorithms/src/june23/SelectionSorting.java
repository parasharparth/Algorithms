package june23;

public class SelectionSorting {

    public static void main(String args[])
    {
        int[] arr = {1,7,2,4,3,5,6,8,0,9};
        int[] result = selectionSort(arr);

        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minimum_index = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[minimum_index])
                {
                    minimum_index = j;
                }
            }

            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
