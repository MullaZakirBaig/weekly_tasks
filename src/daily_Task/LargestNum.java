package daily_Task;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the x value");
		int x=sc.nextInt();
		System.out.println("enter the y value");
		int y=sc.nextInt();
		System.out.println("enter the z value");
		int z=sc.nextInt();
		if(x>y&&z<x) {
			System.out.println("largest number "+x);
		}else if(y<z&&y<x) {
			System.out.println("largest number "+y);
		}else {
			System.out.println("largest number "+z);
		}
	
		
		// moth code programs
		System.out.println("enter the wich month code");
		int monthNum = sc.nextInt();
		switch(monthNum)
		{
		case 1:
		      System.out.println("jan");
		      break;
		case 2:
		      System.out.println("feb");
		      break;
		case 3:
		      System.out.println("march");
		      break;
		case 4:
		      System.out.println("april");
		      break;
		case 5:
		      System.out.println("may");
		      break;
		case 6:
		      System.out.println("jun");
		      break;
		case 7:
		      System.out.println("july");
		      break;
		case 8:
		      System.out.println("aug");
		      break;
		case 9:
		      System.out.println("sep");
		      break;
		case 10:
		      System.out.println("Oct");
		      break;
		case 11:
		      System.out.println("nov");
		      break;
		case 12:
		      System.out.println("dec");
		      break;
		default:
			System.out.println("please enter the corret month code");
		}
	}

}
