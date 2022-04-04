package util;

import java.util.*;
public class InputNumber {

	public static int input()
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		return number;
	}
}
