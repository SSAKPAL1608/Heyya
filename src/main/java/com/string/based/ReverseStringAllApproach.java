package com.string.based;

public class ReverseStringAllApproach {
    public static void main(String[] args) {
        String str = "hello";
        
        // Approach-1: Using char array
        char[] chArr1 = str.toCharArray();
        for (int i = chArr1.length - 1; i >= 0; i--) {
            System.out.print(chArr1[i]);
        }
        System.out.println(); // Print a new line after the reversed string
        
        // Approach-2: Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println(reversedStr);
        
        
        
        // Approach-2: Using StringBuilder
        StringBuffer sb1 = new StringBuffer(str);
        String reversedStr1 = sb1.reverse().toString();
        System.out.println(reversedStr1);
        
        
        
     // Approach-1: Using charAt
        int length =str.length();
        String reverseStr="";
   	 for(int i=length-1 ;i>=0 ;i--) {
   		 reverseStr =reverseStr + str.charAt(i);
   		
   	 }
   	 System.out.println(reverseStr);
    }
}
