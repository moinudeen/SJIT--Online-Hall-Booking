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
        <form class="form" action="" method="GET">
            Username :   <input type="text" name="uname" placeholder=""> <br><br>
                Name :    <input type="text" name="pass" placeholder=""><br> <br>
                Department:    <select name="department">
                    <option> CSE </option>
                    <option> IT </option>                                                                               
                    <option> MECH </option>
                    <option> ECE </option>
                    <option> EEE </option>
                              </select> <br><br>
                Purpose :    <input type="text" name="purpose" placeholder=""><br><br>
                <script src="js/jquery-1.3.2.min.js"></script>
                <script src="js/polyfiller/polyfiller.js"></script>
                <script>
                    webshims.setOptions('forms-ext', {types: 'date'});
                webshims.polyfill('forms forms-ext');
                </script>
               Date : <input type="date">
                 <br><br>
                <input type="submit" >
        </form>
    </body>
</html>
