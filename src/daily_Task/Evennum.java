package daily_Task;

public class Evennum {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	//  Even number by using foor loop-----------------------------
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("by using for loop "+i);
			}
		}
		//  Even number by using while loop-----------------------------
		int i = 2;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println("by using while loop "+i);
			}
			i++;
		}

		// Even number by using do while loop-----------------------------
		do  {
			int j = 2;
			if (j % 2 == 0) {
				System.out.println("by using do while loop "+i);
			}
			i++;
		}
		while(i <= 10);
	}

}
