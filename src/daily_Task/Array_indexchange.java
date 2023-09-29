package daily_Task;

import java.util.Scanner;

public class Array_indexchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         index---         0  1  2  3  4  5  6   7 8   9

		System.out.println("enter the which number remove in array list");
		int j = sc.nextInt();
		for (int i = 0; i < k.length; i++) {
			System.out.println("index[" + i + "]  " + k[i]);
			if (i >= j - 1 && j < k.length) {
				k[i] = k[j];
				j++;
			}
		}

		if (k[k.length - 1] == k.length) {
			k[k.length - 1] = 0;
		}

		int i = 0;
		System.out.println();
		for (int z : k) {
			System.out.println("index[" + i + "]  " + z);
			i++;
		}
		
		System.out.println();
		int x =1,y=2;
		int z = y;
		System.out.println("x value:- "+x +","+" y value:- "+y);
		y=x;
		x=z;
		
		System.out.println("x value:- "+x +","+" y value:- "+y);


	}

}
