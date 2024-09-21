package Java_Example;

import java.util.Scanner;

public class ReverseStringExample1 {
	public static void main(String args[]) {
		// using charAt

		String Originalstr = "Shreya";
		String reversedString = "";

		int length = Originalstr.length();

		/*
		 * for(int i = length-1; i>=0; i--){ reversedString = reversedString +
		 * Originalstr.charAt(i); }
		 * 
		 * System.out.print("The reversed string of the"+ " "+Originalstr+
		 * " "+"is"+" "+reversedString); }
		 */

		// USing char array

		char a[] = Originalstr.toCharArray();
		int l = a.length;

		for (int i = l - 1; i >= 0; i--) {
			reversedString = reversedString + a[i];
		}
		System.out.print("The reversed string of the" + " " + Originalstr + " " + "is" + " " + reversedString);
	}

	/*
	 * StringBuffer sb = new StringBuffer(Originalstr);
	 * System.out.println("The reversed string of the"+ " "+Originalstr+
	 * " "+"is"+" "+sb.reverse());
	 */

}