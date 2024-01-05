package CY2023.December;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args){
		//The first step is to initialize the array in question
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};

		//The second step is to get the input from the user
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = linearSearch(arr,num);
		if(result == -1)
			System.out.println("not found");
		else
			System.out.println("found");
	}

	public static int linearSearch(int[] arr, int element) {
		for(int i=0; i<arr.length-1; i++)
			if(arr[i] == element)
				return i;
		return -1;
	}
}
