package daily_Task;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is one method to reverse the number
		System.out.print("this is reverse number:- ");
		  String x = "4567";
		  
		  for (int i = (x.length() - 1); i >= 0; i--) { 
			  
		  System.out.print(x.charAt(i));
		  
		  }
		 System.out.println();
//------------------------------------------------------
		//this is another method to reverse the number
		
		int num = 1234, rev = 0, reminder;
		while (num != 0) {

			reminder = num % 10;

			rev = rev * 10 + reminder;

			num = num / 10;

		}
		System.out.println("this is reverse number:- "+rev);
	}
	}

