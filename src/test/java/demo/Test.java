package demo;

public class Test implements MyInterface1, MyInterface2 {
	

	@Override
	public void method1() {
		System.out.println("Hi");
		
	}

	@Override
	public void display() {
		System.out.println("Shreya");
		
		
	}

	@Override
	public void show() {
		System.out.println("Sakpal");
		
		
	}

	public static void main(String args[]) {

		// MyInterface i = new Test();
		Test t = new Test();
		t.display();
		t.show();
		t.method1();

	}
	

}
