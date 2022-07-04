package july03.Sorting;

public class InsertionSort {

    public static void main(String[] args)
    {
        //The first step is to get the input elements
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to print the unsorted array
        System.out.println("The unsorted array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }

        //The third step is to call the insertion sort function
        insertionSort(arr);

        //The fourth step is to print the sorted array
        System.out.println();
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void insertionSort(int[] arr)
    {
        //Here we will define and then place the elements according to the key
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
