package com.string.based;

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyClass value: " + value;
    }



    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        
        // Using toString()
        String messageWithToString = "Message with toString(): " + obj.toString();
        
        // Without using toString()
        String messageWithoutToString = "Message without toString(): " + obj;
        
        System.out.println(messageWithToString);
        System.out.println(messageWithoutToString);
    }
}
