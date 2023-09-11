package daily_Task;

public class frz {

	String wel = "WELCOME TO ALL"; // instance variable

	public static void main(String arg[]) {
		Task2 task = new Task2();
		task.det2(); // Instance variable calling in firoz num5
		det(); // static method in task2
		System.out.println();

		Shop1 shop = new Shop1();
		System.out.println(Shop1.details); // static variable calling in Shop1
		shop.TeaAll(); // method calling in Shop1
		System.out.println();

	}

	static void det() {
		String wel = "FIROZ TEA SHOP"; // local variable
		System.out.println(wel);
	}

	public void det2() {
		System.out.println(wel);
	}
}

class Shop1 {
	static String details = "PRICES DETAILS";

	public void TeaAll() {
		int tea = 20;// local variable
		int coffe = 25;
		int milk = 15;
		System.out.println("Tea price - " + tea);
		System.out.println("Coffee price - " + coffe);
		System.out.println("Milk price - " + milk);

	}
}
