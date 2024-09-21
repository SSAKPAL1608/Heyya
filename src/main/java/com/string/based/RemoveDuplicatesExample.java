package com.string.based;

import java.util.LinkedHashSet;

public class RemoveDuplicatesExample {

    // Method to remove duplicate characters from a string
    static void removeDuplicates(String str) {
        // Create a LinkedHashSet to store unique characters while preserving the order
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Add each character of the string into the LinkedHashSet
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        // Print the string after removing duplicate characters
        for (Character c : set) {
            System.out.print(c);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Sample input string
        String str = "javaTpoint is the best learning website";
        
        // Call removeDuplicates method to remove duplicates
        removeDuplicates(str);
    }
}