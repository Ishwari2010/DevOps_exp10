package com.example;

public class App {

    public static void main(String[] args) {

        // 🔴 Security issue (hardcoded password)
        String password = "admin123";

        // 🔴 Duplication + maintainability issues
        printMessage();
        printMessage();   // duplicate call
        printMessage();   // duplicate call

        // 🔴 Maintainability issue (complex nested logic)
        int num = 5;
        if (num > 0) {
            if (num % 2 == 1) {
                if (num < 10) {
                    System.out.println("Odd number less than 10");
                }
            }
        }
    }

    // 🔴 Duplicate logic (same code repeated intentionally)
    public static void printMessage() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void printMessage2() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
