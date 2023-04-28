package CY2023.April.April27;

public class BinarySearch {
	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,5,4,3,2,1};
		int result = binarySearch(arr,4,0,arr.length-1);
		if(result == -1) System.out.println("Not found");
		else System.out.println("Found at position: "+ result);
	}

	public static int binarySearch(int[] arr, int element, int low, int high){
		return -1;
	}
}
