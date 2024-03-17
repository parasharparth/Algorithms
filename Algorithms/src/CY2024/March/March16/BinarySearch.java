package CY2024.March.March16;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int element = s.nextInt();
        binarySearch(arr, element, 0 , arr.length-1);
    }

    public static void binarySearch(int[] arr, int element, int low, int high){
        while(low <= high){
            int middle = low + (high - low)/2;
            if(arr[middle] == element){
                System.out.println("Element found at position: "+middle);
                return;
            }
            else if(arr[middle] > element)
                high = middle-1;
            else
                low = middle+1;
        }
    }
}
