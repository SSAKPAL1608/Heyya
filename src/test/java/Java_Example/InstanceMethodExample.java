package Java_Example;

public class InstanceMethodExample {

	int s, a, b;

	public static void main(String[] args) {

		InstanceMethodExample obj = new InstanceMethodExample();
		obj.add(5, 2);
	}

	public void add(int a, int b) {

		s = a + b;
		System.out.println("The sum of numbers is" + " " + s);
	}
}