package CY2023.April.April26;

public class LinearSearch {

	public static void main(String[] args){
		int[] arr = new int[]{0,9,8,7,6,2,3,5};
		int result = linearSearch(arr, 4);
		if(result == -1) System.out.println("Not found");
		else System.out.println("Found at position "+ result);
	}

	public static int linearSearch(int[] arr, int element){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == element) return i;
		}
		return -1;
	}
}
