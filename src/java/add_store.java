/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class add_store extends HttpServlet {
String st_nm=" ",st_owner=" ",st_email=" ",st_add=" ",st_cont=" ";
    Connection con;
    PreparedStatement ps;
    String msg="";
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
    st_nm=request.getParameter("st_name");
    st_owner=request.getParameter("st_owner");
    st_email=request.getParameter("st_email");
    st_add=request.getParameter("st_address");
    st_cont=request.getParameter("st_contact");
     RequestDispatcher rd=getServletContext().getRequestDispatcher("/add_store.jsp");
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db","root","77492652");
        ps=con.prepareStatement("insert into store(store_add,store_cont,store_email,store_name,store_owner) values(?,?,?,?,?)");
        ps.setString(1,st_add);
        ps.setString(2,st_cont);
        ps.setString(3,st_email);
        ps.setString(4,st_nm);
        ps.setString(5,st_owner);
        
        int i =ps.executeUpdate();
        if(i==1){
                  msg="Data successfully Added";
                  request.setAttribute("stmsg", msg);
                  rd.forward(request, response);
        }
        ps.close();
        con.close();
                
    }catch(Exception e){
        out.println("Error Message while insertion: "+e);
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
