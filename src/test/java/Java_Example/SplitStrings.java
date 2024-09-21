package Java_Example;

public class SplitStrings {  
    public static void main(String[] args) {  
        String str = "Javatotpointttsysthdhtkht";  
        System.out.println("Returning words:");  

        // Split the string based on the delimiter 't'
        String[] arr = str.split("t", 0);  

        // Iterate through the resulting array using a traditional for loop and print each element
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  

        // Print the length of the resulting array
        System.out.println("Split array length: " + arr.length);  
    }  
}
