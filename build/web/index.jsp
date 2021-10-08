<%-- 
    Document   : test
    Created on : Aug 22, 2018, 8:50:42 PM
    Author     : Ashish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
  
%>
	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<%
	  response.setHeader("Cache-Control","no-cache");
       response.setHeader("Cache-Control","no-store");
       response.setHeader("Pragma","no-cache");
       response.setDateHeader("Expires",0);
	%>
	
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon -->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="Bakery">
                
                
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Login</title>

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
                        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">

                        <!-- Custom styles for this template -->
                         <link href="assets/css/signin.css" rel="stylesheet" type="text/css">
		</head>
                
                <body style="background-image: url(img/banner-bg.jpg); background-repeat: no-repeat ">	
			  <header id="header" id="home">
		  		<div class="header-top">
		  			<div class="container">
				  		<div class="row align-items-center">
				  			<div class="col-lg-6 col-sm-6 col-4 header-top-left no-padding">
					      	<div class="menu-social-icons">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-dribbble"></i></a>
								<a href="#"><i class="fa fa-behance"></i></a>
							</div>	    				  					
				  			</div>
				  							  		</div>			  					
		  			</div>
				</div>
				 <%
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from category");
            %>
			    <div class="container main-menu">
			    	<div class="row align-items-center justify-content-between d-flex">
			    		<a href="index.html"><img src="img/logo.png"  width="50" height="30" alt="" title="" /></a>		
						<nav id="nav-menu-container">
							<ul class="nav-menu">
<!--							  <li class="menu-active"><a href="home.jsp">Home</a></li>
							 
							 
							  <li class="menu-has-children"><a href="">Category</a>
							    <ul>
							     <%
          						  while(rs.next()){
          					  %>
							      <li><a href="menu.jsp?idd=<%=rs.getString("cat_id")%>"><%=rs.getString("cat_name")%></a></li>
							       <%
           							 }
           							 %>	
           							  <%
            							 }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 %>			              
							    </ul>
							  </li>
							  <li><a href="#">Contact</a></li>
							  
							   <li class="menu-has-children"><a href="#">User</a>
							   <ul>
							      <li><a href="index.jsp">Login</a></li>
							      <li><a href="#">Your Order</a></li>
							      <li><a href="#">Wishlist</a></li>
							      <li><a href="logout.jsp?key1=2">Logout</a></li>		              
							    </ul></li>-->
							  <li><a href="adminlogin.jsp">Admin</a></li>
							   <!--<li><a href="#">About</a></li>-->							  			          	          
							  
							</ul>
						</nav><!-- #nav-menu-container -->		
			    	</div>
			    </div>
			  </header> 
                                                          
                          
                            <!--login starts-->
                            
                            <form class="form-signin" style="margin-top: 150px;" action="user_login" method="post">
             <!--<img class="mb-4" src="assets/images/logo.jpg" alt="" width="72" height="72">-->
             <h1 class="h3 mb-3 font-weight-normal" style="margin-left: 50px">Sign In Here!!</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" name="email" placeholder="Email address" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" name="pass" placeholder="Password" required>
      <div class="checkbox mb-3">
        
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted" style="">
         <a href="user_register.jsp">Create an Account</a>
      </p>
      
    </form>
                                           
                            
<!--                            <div>
                                
                                 <form class="form-signin" action="user_register" method="post">
             <img class="mb-3" src="assets/images/logo.jpg" alt="" width="150" height="120">
        <h1 class="h3 mb-3 font-weight-normal">Register here!!</h1>
        <input type="text" class="form-control" name="username" placeholder="Enter UserName">
        <input type="email" class="form-control" style="margin-top: 10px;" name="email" placeholder="Enter Email">
         <input type="password" class="form-control" style="margin-top: 10px;" name="pass" placeholder="Enter New Password">
         <input type="password" class="form-control" name="cpass" placeholder="Confirm Password">
        <input type="text" class="form-control" name="address" placeholder="Enter Address">
        <input type="text" class="form-control" style="margin-top: 10px;" name="contact" placeholder="Enter Contact No.">
        <button class="btn btn-lg btn-primary btn-block" style="margin-top: 10px;" type="submit">Create Account</button>
        <a href="index.jsp">Already have account</a>
    </form>
                                
                            </div>
                          -->
                          
			<!-- End footer Area -->	

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
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
		<!--</body>-->
        
    </body>
   
    
    
</html>
