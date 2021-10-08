<%-- 
    Document   : adminhome
    Created on : 26 Jul, 2018, 12:43:59 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <p><i><%
            String catmsg=(String) request.getAttribute("stmsg");
            if(catmsg==null)
            {
                out.println("");
            }
            else
            {
                out.println(catmsg);
            }
            %> </i></p> 
        <form action="add_store" method="post">
        <h1>hello, admin</h1>
        Store Name:<input type="text" name="st_name" placeholder="Enter Store Name"><br/><br/>
        Address:<input type="text" name="st_address" placeholder="Enter Store Address"><br/><br/>
        Contact No.:<input type="text" name="st_contact" placeholder="Enter Contact No."><br/><br/>
        Email:<input type="text" name="st_email" placeholder="Enter Email"><br/><br/>
        Owner Name:<input type="text" name="st_owner" placeholder="Enter Owner Name"><br/><br/>
        <input type="submit" value="Add"><br/><br/>
    </form>
        <a href="adminhome.jsp">Back to Main Menu</a>
</body>
</html>


 <table cellpadding="10" border="2">
                <tr>
                     <th>Store name</th>
                    <th>Store Address </th>
                    <th>Store Contact</th>
                    <th>Store Email</th>
                    <th>Store Owner</th>
                </tr>
                <%
           try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            
        
        Statement st=con.createStatement();
        ResultSet rs =st.executeQuery("select* from store");
                while(rs.next()){
                    
                    out.println("<tr>");
                    out.println("<td>"+rs.getString("store_name")+"</td>");
                    out.println("<td>"+rs.getString("store_add")+"</td>");
                    out.println("<td>"+rs.getString("store_cont")+"</td>");
                    out.println("<td>"+rs.getString("store_email")+"</td>");
                    out.println("<td>"+rs.getString("store_owner")+"</td>");
                    out.println("<td><a href=\"edit.jsp?em="+rs.getInt("store_id")+"\">Edit</a></td>");
                    out.println("<td><a href=\"delete.jsp?em="+rs.getInt("store_id")+"\">Delete</a></td>");
                    out.println("</tr>");   
                }    
                st.close();
                con.close();
                
    }catch(Exception e){
        out.println("Error Message while insertion: "+e);
    }

%>
