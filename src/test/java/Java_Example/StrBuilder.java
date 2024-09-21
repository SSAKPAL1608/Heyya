package Java_Example;

public class StrBuilder  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
//        StringBuilder s1 = new StringBuilder("Hello");    //String 1  
//        StringBuilder s2 = new StringBuilder(" World");    //String 2  
//        StringBuilder s = s1.append(s2);   //String 3 to store the result  
//            System.out.println(s);  //Displays result  
//            
            
            
            
           
            	    String str = new String("Hello, My name is Sachin");

            	    System.out.println("Substrings of given string:");
            	    /* Here we are using first variation of string split() method
            	     * which splits the string into substring based on the regular
            	     * expression, there is no limit on the substrings
            	     */
            	    String strArr[]= str.split("/");
            	    for (String temp: strArr){
            	      System.out.println(temp);
            	    }
            	    
            	    
            	     
            	    	StringBuffer sb=new StringBuffer("Hello ");  
            	    	sb.insert(2,"Java");//now original string is changed  
            	    	System.out.println(sb);//prints HJavaello  
            	    	}  
            	  
}