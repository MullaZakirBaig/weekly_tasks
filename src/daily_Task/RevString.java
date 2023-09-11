package daily_Task;

import java.util.Scanner;

public class RevString {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RevString s = new RevString();
		s.revString();
		s.stringComp();
		s.Fibonacci();
	}

	public void revString() {
		System.out.println("please enter the which name Reverse");
		String name = sc.nextLine();

		for (int i = (name.length() - 1); i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
	
	public void stringComp() {
		System.out.println();
		System.out.println("please enter the correct spelling == shimakh technology");
		String name = sc.nextLine();
		
		if(name.equalsIgnoreCase("shimakh technology")) {
			System.out.println("it is matched the String");
		}else {
			System.out.println("it is not matched the String");
		}
	}
	
	 void Fibonacci() {
		int x = 0;
		int y = 1;
		int z;
		System.out.println("Enter ur Fibonacci Series num:-");
		int num = sc.nextInt();
		System.out.println("this is Fibonacci Series:- ");
		System.out.print(x+" ");
		System.out.print(y+" ");
		for(int i=2;i<=num;i++) {
			z=y+x;
				System.out.print(z+" ");
				x=y;
				y=z;
				
		}
	}
}
