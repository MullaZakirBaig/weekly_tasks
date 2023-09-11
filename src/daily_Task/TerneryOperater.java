package daily_Task;

public class TerneryOperater {

	public static void main(String[] args) {
		
		int x=4,y=2,z=3;
		
		int res = (x>y && x>z)? x : (y>x && y>z)?y:z;
		System.out.println(res);

	}

}
