package practiceTest;

import java.util.HashMap;

import util.InputNumber;
import util.RandomisedArray;

public class LinearSearch {

	public static void main(String args[])
	{
		HashMap<Boolean,Integer> hm = linearSearch(InputNumber.input(),RandomisedArray.getRandomizedArray());
		if(hm.containsKey(true))
		{
			System.out.println("Integer is present in the array at position:- "+hm.get(true));
		}
		else
		{
			System.out.println("The item is not present in the array");
		}
	}
	
	public static HashMap<Boolean,Integer> linearSearch(int num, int[] arr)
	{
		//In linear search, we will take the element and loop it to check with each and every element
		//This is not a very efficient way to do searching.
		HashMap<Boolean, Integer> hm = new HashMap<Boolean,Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			if(num == arr[i])
			{
				hm.put(true, i);
				return hm;
			}
		}
		hm.put(false, -1);
		return hm;
	}
}
