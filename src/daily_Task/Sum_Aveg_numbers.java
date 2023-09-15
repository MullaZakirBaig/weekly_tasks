package daily_Task;

public class Sum_Aveg_numbers {

	/*
	 * public void sumargs(int a, int b, int c, int d, int e, int f, int g, int h) {
	 * 
	 * int[] z = new int[8]; z[0] = a; z[1] = b; z[2] = c; z[3] = d; z[4] = e; z[5]
	 * = f; z[6] = g; z[7] = h;
	 * 
	 * int even = 0; int evencount = 0; int add = 0; int addcount = 0; for (int x :
	 * z) { if (x % 2 == 0) { even = even + x; System.out.println(x + " ");
	 * evencount++; } else { add = add + x; System.out.println(x + " "); addcount++;
	 * } }
	 * 
	 * System.out.println("sum of even numbers : " + even);
	 * System.out.println("average of even numbers : " + even / evencount);
	 * System.out.println("add of even numbers : " + add);
	 * System.out.println("average of even numbers : " + add / addcount);
	 * 
	 * }
	 */
	public static void main(String[] args) {

		/*
		 * Sum_Aveg_numbers obj = new Sum_Aveg_numbers(); obj.sumargs(2, 3, 5, 7, 8, 9,
		 * 8, 5);
		 */
// this programs using in run configration arguments (main method arguments)
		int[] s = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			s[i] = Integer.parseInt(args[i]);
		}

		int even = 0;
		int evencount = 0;
		int add = 0;
		int addcount = 0;
		for (int z : s) {
			if (z % 2 == 0) {
				even = even + z;
				System.out.println(z + " ");
				evencount++;
			} else {
				add = add + z;
				System.out.println(z + " ");
				addcount++;
			}
		}

		System.out.println("sum of even numbers : " + even);
		System.out.println("average of even numbers : " + even / evencount);
		System.out.println("add of even numbers : " + add);
		System.out.println("average of even numbers : " + add / addcount);
	}

}
