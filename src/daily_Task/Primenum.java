package daily_Task;

public class Primenum {

	public static void main(String[] args) {
		Primenum p = new Primenum("zakir");// create a object with class name & calling with parameters
		System.out.println();
		p.primenum(); // calling a method
		System.out.println();
		p.method(20, 30);// calling a method with parameters
	}

	//-----------------CONSTRACTORS--------------------
	Primenum(String x) { // creating constracotors whith paramerters
		System.out.println("thi is constractors with parameters " + x);
	}

	
	//-----------------NON STATIC METHOD WITHOUT PARAMETERS----------------------------------------
	public void primenum() {// create method without parameters

		for (int j = 2; j <= 50; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.println("this is prime numbers:- " + j);
		}
	}
	
	//-----------------NON STATIC METHOD WITH PARAMETERS--------------------

	public void method(int x, int y) { // create method with perameters
		int z = x + y;
		System.out.println("this is parameter addition " + z);

	}
}
