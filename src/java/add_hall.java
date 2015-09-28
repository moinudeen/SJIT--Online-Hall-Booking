/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Moinudeen
 */
public class add_hall extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String hname = request.getParameter("hallname");
        String capacity = request.getParameter("hallcapacity");
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hall Listing</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hall Listing</h1>");
            out.println("<table>");
            out.println("<th>Hall Name</th>");
            out.println("<th>Hall Capacity</th>");
            
      try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SJIT-Booking System","symo","moinu");
        Statement stmt = con.createStatement();
        String query = "INSERT INTO SYMO.HALL VALUES ('"+hname+"',"+capacity+")";
       // ResultSet rs = null;
        stmt.executeUpdate(query);
        String query1 = "SELECT * FROM SYMO.HALL";
        Statement stmt2 = con.createStatement();
        ResultSet rs1 = stmt2.executeQuery(query1);
       // out.println(rs.next());
        while(rs1.next()){
            out.println("<tr>");
            out.println("<td>"+rs1.getString(1)+"</td>");
            out.println("<td>"+rs1.getString(2)+"</td>");
            out.println("</tr>");
        }
        
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }catch(SQLException ex){
          
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
