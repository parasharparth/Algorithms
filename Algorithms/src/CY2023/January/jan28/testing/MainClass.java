package CY2023.January.jan28.testing;

import CY2023.January.jan28.searching.BinarySearch;
import CY2023.January.jan28.searching.LinearSearch;
import CY2023.January.jan28.searching.RecursiveBinarySearch;
import CY2023.January.jan28.sorting.SelectionSort;
import CY2023.utils.Utils;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        System.out.println("FINDING NUMBERS");
        System.out.println("Enter the number you want to search");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Linear Search");
        LinearSearch search = new LinearSearch();
        Utils.searchResult(search.linearSearch(Utils.getArray(),num));
        System.out.println("Binary Search");
        BinarySearch search1 = new BinarySearch();
        Utils.searchResult(search1.binarySearch(Utils.getArray(),num,0, Utils.getArray().length-1));
        System.out.println("Recursive Binary Search");
        RecursiveBinarySearch search2 = new RecursiveBinarySearch();
        Utils.searchResult(search2.binarySearch(Utils.getArray(),num,0, Utils.getArray().length-1));
        System.out.println("Sorting");
        System.out.println("Bubble Sort");
        Utils.printArray(CY2023.January.jan19.sorting.BubbleSort.bubbleSort(Utils.getArray()),3);
        System.out.println("Optimized Sort");
        Utils.printArray(CY2023.January.jan19.sorting.OptimizedSort.optimizedSort(Utils.getArray()),3);
        System.out.println("Selection Sort");
        Utils.printArray(SelectionSort.selectionSort(Utils.getArray()),3);
        System.out.println("Insertion Sort");
        Utils.printArray(CY2023.January.jan19.sorting.InsertionSort.insertionSort(Utils.getArray()),3);
        System.out.println("Merge Sort");
        Utils.printArray(CY2023.January.jan19.sorting.MergeSort.mergeSort(Utils.getArray(),0, Utils.getArray().length-1),3);
        System.out.println("Quick Sort");
        Utils.printArray(CY2023.January.jan19.sorting.QuickSort.quickSort(Utils.getArray(),0, Utils.getArray().length-1),3);
        System.out.println("Counting Sort");
        Utils.printArray(CY2023.January.jan19.sorting.CountingSort.countingSort(Utils.getArray()),3);
        System.out.println("Radix Sort");
        Utils.printArray(CY2023.January.jan19.sorting.RadixSort.radixSort(Utils.getArray()),3);
    }
}
