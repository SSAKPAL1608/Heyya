package SuperKeyword;

public class Subclass extends Parentclass {
	Subclass(){
		// super("hahaha");
		/* Compile implicitly adds super() here as the
		 *  first statement of this constructor.
		 */
		System.out.println("No arg Constructor of child class");
	   }
	   Subclass(int num){
		 super("hahaha");
		System.out.println("arg constructor of child class");
	   }
	   void display(){
			
		System.out.println("Hello!");
	
	   }
	   public static void main(String args[]){
		
		Subclass obj= new Subclass();
		
		obj.display();
		
		Subclass obj2= new Subclass(10);
		obj2.display();
	   }
	
}
