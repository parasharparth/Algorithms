package december21.testing;

import december20.searching.BinarySearch;
import december20.searching.LinearSearch;
import december20.searching.RecursiveBinarySearch;
import december20.sorting.*;
import december21.utils.Utils;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        int[] arr = Utils.getArray();
        System.out.println("FINDING NUMBERS");
        System.out.println("Enter the number you want to search");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Linear Search");
        LinearSearch search = new LinearSearch();
        Utils.searchResult(search.linearSearch(arr,num));
        System.out.println("Binary Search");
        BinarySearch search1 = new BinarySearch();
        Utils.searchResult(search1.binarySearch(arr,num,0,arr.length-1));
        System.out.println("Recursive Binary Search");
        RecursiveBinarySearch search2 = new RecursiveBinarySearch();
        Utils.searchResult(search2.binarySearch(arr,num,0, arr.length-1));
        System.out.println("Sorting");
        System.out.println("Bubble Sort");
        Utils.printArray(BubbleSort.bubbleSort(arr),3);
        System.out.println("Optimized Sort");
        Utils.printArray(OptimizedSort.optimizedSort(arr),3);
        System.out.println("Selection Sort");
        Utils.printArray(SelectionSort.selectionSort(arr),3);
        System.out.println("Insertion Sort");
        Utils.printArray(InsertionSort.insertionSort(arr),3);
        System.out.println("Merge Sort");
        Utils.printArray(MergeSort.mergeSort(arr,0,arr.length-1),3);
        System.out.println("Quick Sort");
        Utils.printArray(QuickSort.quickSort(arr,0,arr.length-1),3);
        System.out.println("Counting Sort");
        Utils.printArray(CountingSort.countingSort(arr),3);
        System.out.println("Radix Sort");
        Utils.printArray(RadixSort.radixSort(arr),3);
    }
}
