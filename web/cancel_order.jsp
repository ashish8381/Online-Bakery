<%-- 
    Document   : cancel_order
    Created on : Nov 13, 2018, 10:00:15 PM
    Author     : Ashish
--%>

<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String order_id = request.getParameter("order_id");
    RequestDispatcher rd=getServletContext().getRequestDispatcher("/home.jsp");
         
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            int i=st.executeUpdate("delete from orders where order_id='"+order_id+"'");
            if(i==1){
                 String msg="Order Cancelled";
                  request.setAttribute("msg", msg);
                  rd.forward(request, response);
                 
                
            }
            
     }catch(Exception e){
         
         out.println(e.getMessage());
     }




%>
