package com.example.java_registration_webapp;

import java.sql.*;



public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        createConnection();
    }

    static void createConnection() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306", "root", "Password");

            //Create a sql statement
            Statement query = connect.createStatement();

            //Insert and update data into database
            query.executeUpdate("INSERT INTO");

            System.out.println("Connected to database");
        }
        catch(ClassCastException | SQLException ex) {
            ex.printStackTrace();


        }
    }
}
