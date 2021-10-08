/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashish
 */
public class img extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
       // int id = Integer.parseInt(request.getParameter("iddd"));
        
        

        
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
    //PrintWriter out = response.getWriter();

     try{
         Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
        Statement stSuper = con.createStatement();
        Statement stSetor = con.createStatement();

        Blob image = null;
        byte[] imgData = null;

        ResultSet rsSuper = stSuper.executeQuery("SELECT pro_img FROM product WHERE pro_id = '1'");

        if (rsSuper.next()) {
        image = rsSuper.getBlob(1);
        imgData = image.getBytes(1, (int) image.length());
        }
//        InputStream i=rsSuper.getBinaryStream("pro_img");
        response.setContentType("image/jpg");
        OutputStream o =response.getOutputStream();
        o.write(imgData);
        o.flush();
        o.close();
        
        
        
        }catch(Exception e){
               // out.println("unable to display image" + e.getMessage());
                e.printStackTrace();
               // return;
                }
    }
        
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
