package com.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Hardcoded password (security issue)
        String password = "12345";

        // Unused variable (code smell)
        int unused = 10;

        // Duplicate code (maintainability issue)
        System.out.println("Hello");
        System.out.println("Hello");

        // Null pointer risk
        String name = null;
        if (name.equals("test")) {   // will cause issue
            System.out.println("Name is test");
        }

        // Empty catch block (bad practice)
        try {
            int a = 10 / 0;
        } catch (Exception e) {
        }

        // Long method + nested conditions (complexity issue)
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                if (i > 1) {
                    if (i < 4) {
                        System.out.println("Complex logic");
                    }
                }
            }
        }

        // Magic number (no constant)
        int result = 100 * 3;
        System.out.println(result);

        // System.out instead of logger
        System.out.println("Program End");
    }
}
