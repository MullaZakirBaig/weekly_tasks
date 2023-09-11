package daily_Task;

public class Task2 {
	String wel = "WELCOME TO ALL"; // instance variable

	public static void main(String arg[]) {
		Task2 task = new Task2();
		task.det2(); // Instance variable in task2
		det(); // static method in task2

		System.out.println();

		System.out.println(SBIBank.details); // static variable calling in SBIbank
		SBIBank.Acct(); // static method calling in SBIbank
		System.out.println();

		ICICIBank bank2 = new ICICIBank(); // creating object ICICIBank
		bank2.Acct(); // non-static method calling in ICICIBank
		System.out.println();

		APGBank bank3 = new APGBank(); // creating object APGBank
		System.out.println(bank3.details); // local variable calling in APGBank
		bank3.Acc(); // method variable calling in APGBank
	}

	static void det() {
		String wel = "BANKS USERS"; // local variable
		System.out.println(wel);
	}

	public void det2() {
		System.out.println(wel);
	}
}

class SBIBank {
	static String details = "SBIBANK ACCOUNT DETAILS";

	static void Acct() {
		String accName = "mulla zakir baig";// local variable
		String accNum = "8522063194";
		String Branch = "Hyderabad";
		String ifscNum = "SBIN00023";
		System.out.println(accName);
		System.out.println(accNum);
		System.out.println(Branch);
		System.out.println(ifscNum);
	}
}

class ICICIBank {
	void Acct() {
		String accName = "mulla zakir baig";// local variable
		String accNum = "8522063194";
		String Branch = "Bangalore";
		String ifscNum = "ICIC00023";
		String details = "ICICIBank ACCOUNT DETAILS";
		System.out.println(details);
		System.out.println(accName);
		System.out.println(accNum);
		System.out.println(Branch);
		System.out.println(ifscNum);
	}
}

class APGBank {
	String details = "APGBANK ACCOUNT DETAILS";// instance varaible

	public void Acc() {
		String dls = "NO DETAILS";// local variable
		System.out.println(dls);
	}

}
