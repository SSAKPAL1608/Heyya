package Java_Example;

public class JavaSwapExample_WithoutTemp {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		// add both the numbers and assign it to first
		x = x + y;//30
		y = x - y;//10
		x = x - y;//20

		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);//20
		System.out.println("Value of y is :" + y);//10
	}
}
//first variable is first added to the second variable and stored in first variable. 
//Then the second variable is subtracted from first variable and stored in second variable.
//Lastly, the value of 2nd variable is subtracted from 1st and stored in first variable. This is how the values of one variable get swapped to another and vice versa, 
//i.e. x becomes 20 and y becomes 10.
