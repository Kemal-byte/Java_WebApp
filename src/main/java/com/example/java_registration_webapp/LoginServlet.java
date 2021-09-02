package com.example.java_registration_webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/LoginV2.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Email = request.getParameter("email");
        String Password = request.getParameter("password");

        if(Validate.checkUser(Email, Password)) {
            getServletContext().getRequestDispatcher("/HomePage.jsp").forward(request, response);
            System.out.println("Successfully logged in");
        } else{
            System.out.println("Username or Password incorrect");
            doGet(request, response);
        }
    }
}
