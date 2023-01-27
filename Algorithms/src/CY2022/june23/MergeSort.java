package CY2022.june23;

public class MergeSort {

    public static void main(String args[])
    {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr,0,arr.length-1);

        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static int[] mergeSort (int[] arr, int low, int high)
    {
        if(low < high)
        {
            int middle = low + (high-low)/2;
             mergeSort(arr,low,middle);
             mergeSort(arr,middle+1,high);
             merge(arr,low,middle,high);
        }
        return arr;
    }

    public static void merge(int[] arr, int low, int middle, int high) {
        //the first step that we need to do is to set up sorted sub-arrays
        int length1 = middle - low + 1;
        int length2 = high - middle;

        int arr1[] = new int[length1];
        int arr2[] = new int[length2];

        for (int i = 0; i < length1; ++i) {
            arr1[i] = arr[low + i];
        }

        for (int j = 0; j < length2; ++j) {
            arr2[j] = arr[middle + 1 + j];
        }

        //The second step is to maintain the index of these arrays for sorting
        int i = 0;
        int j = 0;
        int k = low;

        //The third step is to check whether the elements finished in the array or not after putting the bigger element (after comparison)
        //into the new sorted array
        while (i < length1 && j < length2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        //if the elements in j are finished
        while (i < length1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        //if the elements in i are finished
        while (j < length2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
