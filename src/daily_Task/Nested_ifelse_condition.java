package daily_Task;

public class Nested_ifelse_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maths = 60;
		int science = 50;
		int english = 40;
		int french = 3;
		
//Nested if else conditions---------------------------------------

		/*
		 * if (english >= 40 || french <= 20) {
		 * 
		 * if (maths >= 60 && science >= 50) {
		 * System.out.println("it is elgible to promoted"); } } else {
		 * System.out.println("it is not elgible to promoted"); }
		 */
		
//if else condition-----------------------------------------------
		
		if ( maths >= 60 && science >= 50 && (english >= 40 || french <= 20)) {

			System.out.println("it is elgible to promoted");

		} else {
			System.out.println("it is not elgible to promoted");
		}
	}

}
