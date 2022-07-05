package july03.Sorting;

public class MergeSort {

    public static void main(String[] args)
    {
        //The first step is to get the input
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to print the unsorted array
        System.out.println("The unsorted array is: ");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        //Call the merge sort function
        mergeSort(arr,0,arr.length-1);

        //The fourth step is to print the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int middle = low + (high-low)/2;
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
    }

    public static void merge(int[] arr, int low, int middle, int high)
    {
        //The first step for merging is to create the two arrays
        int length1 = middle-low+1;
        int length2 = high-middle;

        //Create the two arrays
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

        //Populating the new arrays
        for(int i=0; i<length1; i++)
        {
            arr1[i] = arr[i+low];
        }
        for(int j=0; j<length2; j++)
        {
            arr2[j] = arr[j + middle + 1];
        }

        //The next step is to check the elements and populate the new array
        int i = 0;
        int j= 0;
        int k = low;
        while(i<length1 && j<length2)
        {
            if(arr1[i] < arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<length1)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j<length2)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
