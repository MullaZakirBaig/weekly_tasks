package oops_Concepts;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj = new C1();
		obj.method_a();
		obj.method_b();
		obj.method_c();
	}

}
class A1{
	void method_a() {
		System.out.println("class A");
	}
}
class B1 extends A1{
	void method_b() {
		System.out.println("class B");
	}
}

class C1 extends B1{
	void method_c() {
		System.out.println("class C");
	}
}