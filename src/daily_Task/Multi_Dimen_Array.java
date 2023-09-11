package daily_Task;

public class Multi_Dimen_Array {

	public static void main(String[] args) {

		int[][] x = new int[3][3];

		x[0][0] = 2;
		x[0][1] = 6;
		x[0][2] = 8;
		x[1][0] = 45;
		x[1][1] = 23;
		x[1][2] = 1;
		x[2][0] = 35;
		x[2][1] = 6;
		x[2][2] = 9;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(" " + x[i][j]);
				
				}
			System.out.println();
			}
		System.out.println();
			
		// it is also multidimentional array by using for each loop
		int[][] y = { { 2, 6, 8 }, { 45, 23, 1 }, { 35, 6, 9 } };

		for (int[] z : y) {
			for (int j : z) {
				System.out.print(" " + j);
			}

			System.out.println();
		}

	}

}
