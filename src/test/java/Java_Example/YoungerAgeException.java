package Java_Example;

public class YoungerAgeException extends Exception{
	YoungerAgeException(){
		super("You cannot vote");
		
	}
	YoungerAgeException(String Message){
		super(Message);
		
	}
	
}




