package CY2024.March.March16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int element = s.nextInt();
        linearSearch(arr,element);
        linearSearchUsingStream(arr,element);
        linearSearchUsingIntStream(arr, element);
    }

    public static void linearSearch(int[] arr, int element) {
        System.out.println("Using Traditional for loops");
        for(int i=0; i<arr.length; i++)
            if(arr[i] == element) {
                System.out.println("Element found at position: " + i);
                return;
            }
        System.out.println("Element Not found");
    }

    public static void linearSearchUsingStream(int[] arr, int element){
        System.out.println("Using Collectors and stream");
        Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().filter(num -> arr[num] == element).findFirst().ifPresentOrElse(
                num -> System.out.println("Element Found at position: "+num),
                () -> System.out.println("Element not found")
        );
    }

    public static void linearSearchUsingIntStream(int[] arr, int element){
        System.out.println("Using IntStream (much better)");
        IntStream.range(0, arr.length).filter(i -> arr[i] == element).findFirst().ifPresentOrElse(
                index -> System.out.println("Element Found at Position: "+index),
                () -> System.out.println("Element Not Found")
        );
    }
}
