package oops_Concepts;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.method_a();
		obj.method_b();
	}

}
class A{
	void method_a() {
		System.out.println("class A");
	}
}
class B extends A{
	void method_b() {
		System.out.println("class B");
	}
}