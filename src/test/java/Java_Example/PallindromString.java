package Java_Example;

import java.util.Scanner;



public class PallindromString {

	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter your string");
//	String str =sc.nextLine();
	
	 String original_str = "l    evel";
	
	 //now reverse string
	 
	 String reverseStr="";
	 int length =original_str.length();
	 for(int i=length-1 ;i>=0 ;i--) {
		 reverseStr =reverseStr + original_str.charAt(i);
		
	 }
	 System.out.println(reverseStr);
	 String reversedWithoutSpaces = reverseStr.replaceAll("\\s", "");
	 System.out.println("Reversed String without spaces: " + reversedWithoutSpaces);

	//Comapre the strings
	if (original_str.equals(reverseStr)) {
	      System.out.println(original_str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(original_str + " is not a Palindrome String.");
	    }
	
	// Remove spaces from the reversed string
    

   
		
	}}
