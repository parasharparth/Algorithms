package CY2022.June19;

import java.util.*;
public class OptimizedBubbleSorting {

    public static void main(String args[])
    {
        int[] arr = optimizedBubbleSort(new Random().ints(10,0,1000).toArray());

        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static int[] optimizedBubbleSort(int[] nums)
    {
        for(int i=0; i<nums.length-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<nums.length-i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
        return nums;
    }
}
