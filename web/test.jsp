<%-- 
    Document   : test
    Created on : Aug 22, 2018, 8:50:42 PM
    Author     : Ashish
--%>

<%@page import="java.sql.*"%>
<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test</title>
    </head>
    <body>
   
      <%  
        int isd=Integer.parseInt(request.getParameter("iddd"));
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
        Statement stSuper = con.createStatement();
        Statement stSetor = con.createStatement();

        Blob image = null;
        byte[] imgData = null;

        ResultSet rsSuper = stSuper.executeQuery("SELECT pro_img FROM product WHERE pro_id = 'isd'");

        if (rsSuper.next()) {
        image = rsSuper.getBlob(1);
        imgData = image.getBytes(1, (int) image.length());
        }
//        InputStream i=rsSuper.getBinaryStream("pro_img");
        response.setContentType("image/gif");
        OutputStream o = response.getOutputStream();
        o.write(imgData);
        o.flush();
        o.close();
        
        
        
        }catch(Exception e){
                out.println("unable to display image" + e.getMessage());
                
                return;
                }
                        %>

        

        
   </body>
      
   
    
    
</html>
