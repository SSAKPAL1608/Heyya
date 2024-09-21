package Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
    	//you are creating an instance of the Horse class and assigning it to a reference variable of type Animal
        Animal animal1 = new Horse();
        Animal animal2 = new Cat();

        animal1.sound();  // Output: Neigh
        animal2.sound();  // Output: Meow

        // You can easily change the type of object assigned to 'animal1'
        animal1 = new Cat();
        animal1.sound();  // Output: Meow
    }
}