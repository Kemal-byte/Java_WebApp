package com.example.java_registration_webapp;

import java.sql.*;

public class Validate {
    public static boolean checkUser(String Email, String Password) {
        boolean status = false;
        String url = "jdbc:mysql://localhost:3306";

        try{
            // Loading drivers fof mysql
            Class.forName("com.mysql.jdbc.Driver");

            //Connection to the database
            Connection connection = DriverManager.getConnection(url, "root","Password");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM userdb.users WHERE email=? AND password=?");
            statement.setString(1,Email);
            statement.setString(2,Password);
            ResultSet rs = statement.executeQuery();
            status = rs.next();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
}
