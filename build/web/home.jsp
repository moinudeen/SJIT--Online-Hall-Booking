<%-- 
    Document   : home
    Created on : 18 Sep, 2015, 8:46:13 PM
    Author     : Moinudeen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome to home!</h1>
        <form class="form" action="login" method="GET">
                    <input type="text" name="uname" placeholder="Username">
                    <input type="password" name="pass" placeholder="Password">
                    <input type="submit" id="login-button">
        </form>
    </body>
</html>
