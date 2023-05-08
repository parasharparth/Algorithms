package CY2023.May.May06;

public class LinearSearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
		int result = linearSearch(arr,4);
		if(result == -1) System.out.println("Not found");
		else System.out.println("Found at position: "+result);
	}

	public static int linearSearch(int[] arr, int element){
		for(int i=0; i<arr.length; i++)
			if(arr[i] == element)
				return i;
		return -1;
	}
}
