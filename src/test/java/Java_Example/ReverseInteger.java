package Java_Example;
public class ReverseInteger {
    public static void main(String[] args) {
        int num = 12345; // Integer to be reversed
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;                           //5 reminder
            reversedNum = reversedNum * 10 + digit;        //5
            num = num / 10;                             //1234
        }
        System.out.println("Reversed number: " + reversedNum);
    }
}
