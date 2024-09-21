package Interface;

public class Interface_Example {
	public static void main(String args[]) {
	    // Creating an object of Dog and assigning it to an Animal reference
	    Animal animal1 = new Dog();

	    // Invoking the sound method through the Animal reference
	    animal1.sound();
	}
//While the code using the Animal interface means main method code doesn't need to know the specific details of how Sound method is implemented in Dog 
//it doesn't mean there's zero knowledge of the implementation.
	//Animal animal1 = new Dog(); why we have allowed to like this becuase dog is the class that implements animal interface 
	
}
