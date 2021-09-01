<%--
  Created by IntelliJ IDEA.
  User: roodi
  Date: 29-Aug-21
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>

    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="CSS/RegisterCSS.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>


<body>

<div class="container">
    <div class="title">Registration</div>
    <div class="content">
        <form method="post" action="${pageContext.request.contextPath}/RegisterServlet">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">Full Name</span>
                    <label for="name"></label>
                    <input type="text" name ="name" placeholder="Enter your name" required id="name">
                </div>
                <div class="input-box">
                    <span class="details">Username</span>
                    <label for="username"></label>
                    <input type="text" name="username" placeholder="Enter your username" required id="username">
                </div>
                <div class="input-box">
                    <span class="details">Email</span>
                    <label for ="email"></label>
                    <input type="text" name="email" placeholder="Enter your email" required id="email">
                </div>
                <div class="input-box">
                    <span class="details">Phone Number</span>
                    <label for="phoneNumber"></label>
                    <input type="text" name="phoneNumber" placeholder="Enter your number" required id="phoneNumber">
                </div>
                <div class="input-box">
                    <span class="details">Password</span>
                    <label for="password"></label>
                    <input type="text" name="password" placeholder="Enter your password" required id="password">
                </div>
                <div class="input-box">
                    <span class="details">Confirm Password</span>
                    <label for="confirmPassword"></label>
                    <input type="text" name="confirmPassword" placeholder="Confirm your password" required id="confirmPassword">
                </div>
            </div>
            <div class="button">
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
</div>
</body>
</html>
