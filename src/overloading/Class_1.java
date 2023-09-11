package overloading;

public class Class_1 {

	public static void main(String[] args) {
		

		A a = new A();
		a.method_1(10, 10);
		a.method_1(10, 10, 10);
		a.method_1(10, 10, 10, 10);
	}

}

class A{
	
	public void method_1(int a,int b) {
		int c=a+b;
		
		System.out.println(c);
	}
	public void method_1(int a,int b,int c) {
		int d=a+b+c;
		
		System.out.println(d);
	}public void method_1(int a,int b,int c,int d) {
		int e=a+b+c+d;
		
		System.out.println(e);
	}
}