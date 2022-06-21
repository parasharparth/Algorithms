package Jun20;

public class SelectionSortPractice {
    public static void main(String args[])
    {
        int[] arr = {9,5,1,2,8,6,3,4,7};
        arr = selectionSortingPractice(arr);

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] selectionSortingPractice(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            int minimum_index = i;

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] <arr[minimum_index])
                {
                    minimum_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimum_index];
            arr[minimum_index] = temp;
        }
        return arr;
    }
}
