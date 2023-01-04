package CY2023.January.Jan03.testing;

import CY2023.January.Jan03.searching.BinarySearch;
import CY2023.January.Jan03.searching.LinearSearch;
import CY2023.January.Jan03.searching.RecursiveBinarySearch;
import CY2023.January.Jan03.sorting.*;
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
        Utils.printArray(BubbleSort.bubbleSort(Utils.getArray()),3);
        System.out.println("Optimized Sort");
//        Utils.printArray(OptimizedSort.optimizedSort(Utils.getArray()),3);
//        System.out.println("Selection Sort");
//        Utils.printArray(SelectionSort.selectionSort(Utils.getArray()),3);
//        System.out.println("Insertion Sort");
//        Utils.printArray(InsertionSort.insertionSort(Utils.getArray()),3);
//        System.out.println("Merge Sort");
//        Utils.printArray(MergeSort.mergeSort(Utils.getArray(),0, Utils.getArray().length-1),3);
//        System.out.println("Quick Sort");
//        Utils.printArray(QuickSort.quickSort(Utils.getArray(),0, Utils.getArray().length-1),3);
//        System.out.println("Counting Sort");
//        Utils.printArray(CountingSort.countingSort(Utils.getArray()),3);
//        System.out.println("Radix Sort");
//        Utils.printArray(RadixSort.radixSort(Utils.getArray()),3);
    }
}
