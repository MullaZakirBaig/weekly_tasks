package daily_Task;

import java.util.Scanner;

public class Aromstrong_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the three Digit Number: ");
		// 153,370,371,407
		int num = sc.nextInt(), num1 = num, reminder = 0;
		int rem = 0;
		double result = 0;
		int res = 0;

		int ar[] = new int[3];
		int i = 0;

		while (num != 0) {

			reminder = num % 10;
			num = num / 10;
			rem++;
			ar[i] = reminder;
			i++;
		}

		int x = 0;
		for (int j = 0; j < ar.length; j++) {
			// result = Math.pow(ar[j], rem);
			res = ar[j] * ar[j] * ar[j];
			// x = (int) (x + result);
			x = x + res;
		}

		if (num1 == x) {
			System.out.println("It is Armstrong number: " + x);
		} else {
			System.out.println("It is not Armstrong number165");
		}

	}
}
