package com.example;

public class App {
    public static void main(String[] args) {

        // Hardcoded secret (security issue)
        String password = "admin123";

        // Null pointer (reliability issue)
        String str = null;
        System.out.println(str.length());  // will crash

    }
}
