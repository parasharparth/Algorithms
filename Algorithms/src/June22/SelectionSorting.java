package June22;

public class SelectionSorting {

    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};

        int[] result = selectionSort(arr);

        System.out.println("The sorted array is:");
        for(int i=0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            int mimimum_index = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[mimimum_index])
                {
                    mimimum_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mimimum_index];
            arr[mimimum_index] = temp;
        }
        return arr;
    }
}
