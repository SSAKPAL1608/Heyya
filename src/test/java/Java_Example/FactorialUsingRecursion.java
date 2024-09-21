package Java_Example;

public class FactorialUsingRecursion {
	int fact=1;
	public static void main(String[] args) {
		
		int num = 5; 
		int result; 
		
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		result=f.calfact(num);
	     System.out.println(result);
	}
	
       int calfact(int num) {
		    if(num>1) { //5>1
    		fact= fact*num;//1*5=5
    		calfact(num -1);//5-1 =4
    		}
    	   return fact;  //5*4*3*2*1
	 
	 
	 
 
}
}