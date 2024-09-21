package Java_Example;

public class StaticBlock {
	//can direcrly initialize here
	static int num;
	static String mystr;
	static{
	      num = 97;
	      mystr = "Static keyword in Java";
	      System.out.println("This will execute before main method");
	   }
	   
	   public static void main(String args[])
	   {
		   
		 
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	      System.out.println("This will execute after main method");
	   }
	
}
