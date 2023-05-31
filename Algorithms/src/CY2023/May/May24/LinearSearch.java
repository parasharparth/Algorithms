package CY2023.May.May24;

public class LinearSearch {

	public static void main(String[] args){
		int[] arr = new int[]{0,1,2,3,7,4,6,5};
		int result = linearSearch(arr, 5);
		if(result == -1) System.out.println("Not found");
		else System.out.println("Found at position: "+ result);
	}

	public static int linearSearch(int[] arr, int element){
		for(int i=0; i<arr.length; i++)

			if(arr[i] == element) return i;
		return -1;
	}
}
