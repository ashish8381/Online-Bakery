<%-- 
    Document   : headerr
    Created on : Nov 11, 2018, 5:37:40 PM
    Author     : Ashish
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/jquery-ui.css">			
			<link rel="stylesheet" href="css/owl.carousel.css">
			<link rel="stylesheet" href="css/main.css">
        
    </head>
    <body>
        <header id="header" id="home">
       <%
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from category");
            %>
			    <div class="container main-menu">
			    	<div class="row align-items-center justify-content-between d-flex">
			    		<a href="index.html"><img src="img/logo.png"  width="50" height="40" alt="" title="" /></a>		
						<nav id="nav-menu-container">
							<ul class="nav-menu">
							  <li class="menu-active"><a href="home.jsp">Home</a></li>
							 
							 
							  <li class="menu-has-children"><a href="">Category</a>
							    <ul>
							     <%
          						  while(rs.next()){
          					  %>
							      <li><a href="menu.jsp?idd=<%=rs.getString("cat_id")%>"><%=rs.getString("cat_name")%></a></li>
							       <%
           							 }
           							 %>	
           							  			              
							    </ul>
							  </li>
							  
							   <li class="menu-has-children"><a href="#">User</a>
							   <ul>
							      <!--<li><a href="index.jsp">Login</a></li>-->
							      <li><a href="yourorder.jsp">Your Order</a></li>
							      <li><a href="cart.jsp">Your Cart</a></li>
							      <li><a href="logout.jsp?key1=2">Logout</a></li>		              
							    </ul></li>
                                                            <li><a href="contact.jsp">Contact</a></li>
							  
							  <!--<li><a href="adminlogin.jsp">Admin</a></li>-->
							   <!--<li><a href="#">About</a></li>-->							  			          	          
							  
							</ul>
						</nav><!-- #nav-menu-container -->		
			    	</div>
			    </div>
			  </header> <!--#header--> 
                          <%
                          
                           }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 %>

        
    	<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="js/popper.min.js" ></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
			<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>
  			<script src="js/easing.min.js"></script>			
			<script src="js/hoverIntent.js"></script>
			<script src="js/superfish.min.js"></script>	
			<script src="js/jquery.ajaxchimp.min.js"></script>
			<script src="js/jquery.magnific-popup.min.js"></script>	
 			<script src="js/jquery-ui.js"></script>			
			<script src="js/owl.carousel.min.js"></script>						
			<script src="js/jquery.nice-select.min.js"></script>							
			<script src="js/mail-script.js"></script>	
			<script src="js/main.js"></script>	
		</body>
</html>
