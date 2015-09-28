<%-- 
    Document   : list-hall
    Created on : 28 Sep, 2015, 3:58:40 PM
    Author     : Moinudeen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halls List</title>
    </head>
    <body>
        <h1>Hall Listing</h1> <br><br>
        <% Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SJIT-Booking System","symo","moinu");
        Statement stmt = con.createStatement();
        String query = "select * from SYMO.HALL";
        ResultSet resultset = stmt.executeQuery(query); %>
    <center>
        <table BORDER="1">
            <tr>
                <th>Hall Name</th>
                <th>Capacity</th>
                
            </tr>
            <% while(resultset.next()){ %>
            <tr>
                <td> <%= resultset.getString(1) %></td>
                <td> <%= resultset.getString(2) %></td>
                
            </tr>
            <% } %>
        </table>
    </center>
    </body>
</html>
