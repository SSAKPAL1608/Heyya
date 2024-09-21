package com.string.based;
public class Sdfv {
	 public static void main(String[] args) {
//String s1 = "hello"; // String literal in the pool
//String s2 = "hello"; // Reference to the same instance in the pool
//String s3 = new String("hello"); // New instance created in heap
//
//System.out.println(s1 == s2); // true (reference equality)
//System.out.println(s1 == s3); // false (different instances)
//System.out.println(s1.equals(s3)); // true (content equality)
//
//



		 String s1 = "Hello";
		 System.out.println("Original String: " + s1);

		 s1 = s1+ " "+"World"; // Modify the string by concatenating " World"

		 System.out.println("Modified String: " + s1); // Print the modified string

		


}}