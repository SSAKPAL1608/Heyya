package Java_Example;
//customized checked exception
public class Voting {
	
//checked -remove try catch and see giving error
	public static void main(String args[]) throws YoungerAgeException {
		
		
		int age = 16 ;
		
		if(age<18){
		//throw new YoungerAgeException("you cannot vote as you are below 18 years");
			throw new YoungerAgeException();
		}else
		{
			System.out.println("You can vote now");
		}
		}
		
		
			
		
}