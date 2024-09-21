package Java_Example;

import java.util.Scanner;

public class SplitString 
{
 public static void main(String[] args) 
 {
//	   
//	 Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your string");
//		String str1 =sc.nextLine();
	 
	 
	    String str = "welcome to the family";
	   // split string from space
	   String result[] = str.split("");
	   for (int i=0; i < result.length; i++)
	   {
	     System.out.println(result[i]);
	   }
	 }
	}