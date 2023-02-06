package CY2023.February.Feb06.searching;

public class LinearSearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		int result = linearSearch(arr,4);
		if(result == -1)
			System.out.println("Not found");
		else
			System.out.println("Found at position: "+result+1);
	}

	public static int linearSearch(int[] arr, int element){
		for(int i=0; i<arr.length; i++)
			if(arr[i]==element)
				return i;
		return -1;
	}
}
