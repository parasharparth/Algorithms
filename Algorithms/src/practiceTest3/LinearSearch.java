package practiceTest3;

import util.InputNumber;

public class LinearSearch {
	
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		linearSearching(InputNumber.input(), arr);
	}
	
	public static void linearSearching(int num, int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(num == arr[i]) 
			{
				System.out.println("Number found");
				System.exit(0);
			}
		}
			System.out.println("Number not found");
	}
}
