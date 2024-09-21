package Java_Example;

public class uncheckedException extends RuntimeException {//unchecked
	
		uncheckedException(){
			super("You cannot vote");
			
		}
		
		uncheckedException(String message){
			super(message);
			
		}
		
	}



