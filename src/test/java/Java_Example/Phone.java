package Java_Example;

public class Phone {
	// Properties
	String brand;
	String model;
	String color;

	public Phone(String brand1, String model1, String color1) {
		this.brand = brand1;
		this.model = model1;
		this.color = color1;

	}

	// Method to turn the phone on
	void turnOn() {
		System.out.println("Please turn on TV");
	}

	// Main method for testing
	public static void main(String[] args) {
		Phone p = new Phone("Apple", "iPhone 12", "White");
		//Phone p1 =new Phone();
//		p1.brand ="apple";
//		p1.color="black";
//		p1.model="Iphone 13";
		System.out.println(p.brand + " " + p.model + " " + p.color);
		p.turnOn();
	}
}


//