package daily_Task;

public class For_each_loop {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40 };
		int sum = 0;
		for (int x : arr) {

			System.out.println("Sum of the array:- " + x);
		}
		System.out.println();
		
		String st[] = { "Zakir", "Raju", "Suresh" };
		for (String z : st) {

			System.out.println("Sum of the array:- " + z);
		}

	}

}
