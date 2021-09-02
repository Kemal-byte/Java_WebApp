package com.example.java_registration_webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullName = request.getParameter("name");
        String userName = request.getParameter("username");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        String url = "jdbc:mysql://localhost:3306";
        Connection conn = null;

        if(!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
            doGet(request, response);
        } else {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, "root","Password");
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO userdb.users (name, username, email, password, phoneNumber) VALUES (?,?,?,?,?)");
                System.out.println("It has just published the information to the database");
                System.out.println(fullName + " " + email);

                stmt.setString(1,fullName);
                stmt.setString(2,userName);
                stmt.setString(3,email);
                stmt.setString(4,password);
                stmt.setString(5,phoneNumber);
                stmt.executeUpdate();
                stmt.close();
                conn.close();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Created a database and store the values in it.");
        }
        System.out.println("Post request has been made by registration form.");
        getServletContext().getRequestDispatcher("/LoginV2.html").forward(request, response);
    }
}
