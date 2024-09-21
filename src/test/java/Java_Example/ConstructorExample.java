package Java_Example;

public class ConstructorExample {
    // Instance variables
    String brand;
    String model;
    int year;

 // No-argument constructor with additional logic
    public ConstructorExample() {
        System.out.println("Hi");
        // No additional initialization logic in this constructor
        // Instance variables will assume their default values
    }

    // Parameterized constructor with initialization logic
    // Takes three parameters to customize the instance variables during object creation
    public ConstructorExample(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // Using the default constructor
        ConstructorExample defaultCar = new ConstructorExample();
        defaultCar.displayInfo(); // Display default values

        // Using the parameterized constructor with initialization logic
        ConstructorExample customCar = new ConstructorExample("Toyota", "Camry", 2022);
        customCar.displayInfo(); // Display customized values
    }
}
