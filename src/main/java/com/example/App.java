package com.example;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {

        String userInput = "admin'; --"; // simulated input

        // SQL Injection vulnerability
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}
