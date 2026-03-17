package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Demo3 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        // Step 1: Load the MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish Connection to the database
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/umit", "root", "root");

        // Step 3: Create a Statement object
        Statement stmt = con.createStatement();

        // Step 4: Execute INSERT queries using executeUpdate()
        int r1 = stmt.executeUpdate(
            "INSERT INTO customer (name, design, dept, salary) " +
        	"VALUES ('Akansha', 'Tester', 'QA', 48000)");
        		

        int r2 = stmt.executeUpdate(
            "INSERT INTO customer (name, design, dept, salary) " +
        	"VALUES ('Josh', 'Analyst', 'Finance', 55000)");

        // Step 5: Print confirmation
        System.out.println("Insertion Operation via JDBC");
        System.out.println("============================");
        System.out.println("Record 1 inserted: " + r1 + " row(s) affected");
        System.out.println("Record 2 inserted: " + r2 + " row(s) affected");
        System.out.println("All records inserted successfully!");

        // Step 6: Close the connection
        con.close();
    }
}
