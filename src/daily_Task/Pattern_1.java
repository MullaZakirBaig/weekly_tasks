package daily_Task;

public class Pattern_1 {

	public static void main(String[] args) {
/*
	//   for loop using pattern---------------------------------
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
// it is another method toprint the pattern by using array--------------------
		
		String s[] = { "*", "**", "***", "****", "*****" };
		for (String z1 : s) {
			System.out.println(z1);
		}
		
		
	//   While loop using pattern---------------------------------
		
		int i = 1;
		while (i <= 10) {

			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;

			}

			System.out.println();
			i++;
		}

		System.out.println();
//   While loop using pattern---------------------------------
		int z = 1;
		while (z <= 10) {
			int j = 1;

			// Print spaces before stars
			while (j < z) {
				System.out.print("  "); // Two spaces to keep the pattern aligned
				j++;
			}

			// Print stars
			while (j <= 10) {
				System.out.print("* ");
				j++;
			}

			System.out.println();
			z++;
		}

*/
		// Do While loop using pattern---------------------------------
		int x = 10;
		do {
			int y = 0;

			// Print spaces before stars
			do {
				System.out.print("*"); // Two spaces to keep the pattern aligned
				y++;
			} while (y < x);

			// Print stars
			do {
				System.out.print("  ");
				y--;
			} while (y >= 0);

			System.out.println();
			x--;
		} while (x <= 0);

	}

}
