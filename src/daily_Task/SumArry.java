package daily_Task;

import java.util.Arrays;

public class SumArry {

	public static void main(String[] args) {

		//sum values of an array------------------------
		
		  int arr[] = {10,20,30,40}; 
		  int sum=0; for(int x : arr) {
		  
		  sum = sum+x; } 
		  System.out.println("Sum of the array:- "+sum);
		  System.out.println();
		 
//-last digit of a given number-----------------------------------
		  
		int z = 123;
		while (z >= 0) {
			int c = z % 10;
			System.out.println("it is last digit number:- "+c);
			break;
		}
		System.out.println();
//----sort a numeric array and string array-----------------------------------

		int x[] = { 10, 0, 5, 7, -8 };
		String st[] = { "Zakir", "Raju", "Suresh" };
		Arrays.sort(x);
		Arrays.sort(st);

		for (int y : x) {
			System.out.println("sorted by numeric values:- "+y);
		}
		System.out.println();
		for (String a : st) {
			System.out.println("sorted by String latters:- "+a);
		}

	}

}
