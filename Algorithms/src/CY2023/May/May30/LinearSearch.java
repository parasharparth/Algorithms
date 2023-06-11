package CY2023.May.May30;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,1,2,3,5,4,7,6};
		int flag = -1;
		System.out.println("The given array is: ");
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
		System.out.println("Input the element you want to find");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		sc.close();
		for(int i=0; i<arr.length; i++)
			if(arr[i] == element)
				flag = i;
		if(flag == -1)
			System.out.println("Not found");
		else
			System.out.println("Found at position: "+flag);
	}
}
