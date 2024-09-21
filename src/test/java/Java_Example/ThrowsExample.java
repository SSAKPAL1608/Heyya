package Java_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	void ReadWrite() throws FileNotFoundException {

		FileInputStream fin = new FileInputStream("D:\\testout.txt");
		

	}

	public static void main(String args[]) throws FileNotFoundException {

		ThrowsExample rd = new ThrowsExample();
		try {
			rd.ReadWrite();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hi Shreya");
		System.out.println("Hi Samarth");
	}
}