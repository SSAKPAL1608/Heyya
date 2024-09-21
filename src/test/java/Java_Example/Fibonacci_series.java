package Java_Example;

public class Fibonacci_series {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum;
        System.out.print(n1 + " " + n2); // Print the first two numbers

        // Loop to print the next 11 numbers (total 13 numbers)
        for (int i = 2; i < 15; i++) {
            sum = n1 + n2; // Calculate the next number in the series
            System.out.print(" " + sum); // Print the next number
            n1 = n2; // Update n1 to the previous n2
            n2 = sum; // Update n2 to the newly calculated sum
        }
    }
}
