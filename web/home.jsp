    <%@page import="java.sql.*"%>
     <%@include file="/headerr.jsp" %>
<%

  // RequestDispatcher rd=getServletContext().getRequestDispatcher("/index.jsp");
   String name=session.getAttribute("name").toString();
   String uid=session.getAttribute("user_id").toString();
   
        if(uid.equals("null")){
             response.sendRedirect("index.jsp");
        }
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
		<title>Bakery</title>

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
                    <%
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();

            %>
	<section class="banner-area relative" id="home">
				<div class="overlay overlay-bg"></div>
				<div class="container">
					<div class="row fullscreen d-flex justify-content-center align-items-center">
						<div class="banner-content col-lg-10 col-md-12 justify-content-center">
							<h6 class="text-uppercase">Whenever we bake, bake with our heart</h6>
							<h1>
								Love with baking items			
							</h1>
							<p class="text-white mx-auto">
								Best Online Bakery of Lucknow.							</p>
							
                                                </div>											
					</div>
				</div>
			</section>
			<!-- End banner Area -->

			
			<!-- Start item-category Area -->
			<section class="item-category-area section-gap">
				<div class="container">
					<div class="row d-flex justify-content-center">
						<div class="col-md-12 pb-80 header-text text-center">
							<h1 class="pb-10">Category of available items</h1>
							<p>
								They are grilling celebrities in their own right.
							</p>
						</div>
					</div>	
                                     <% ResultSet rs1=st.executeQuery("select *from category");%>
                                     
					<div class="row">
                                            <% int i=0;
          						  while(rs1.next()&& i<=4){
                                                              i=i=1;
          					  %>
                                            
						<div class="col-lg-3 col-md-6">
							<div class="single-cat-item">
								<div class="thumb">
									<img class="img-fluid" src="img/c1.jpg" alt="">
								</div>	
								<a href="menu.jsp?idd=<%=rs1.getString("cat_id")%>"><h4><%=rs1.getString("cat_name")%></h4></a>
								<p>
									<%=rs1.getString("cat_detail")%>
								</p>
							</div>
						</div>
                                                    <% } %> 
                                                   
                                                                
																						
<!--                                            <a class="primary-btn mx-auto mt-80" href="#">View Full Menu</a>-->
					</div>
				</div>	
			</section>
			<!-- End item-category Area -->
                        <%
            							 }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 %>
		

			<!-- Start review Area -->
			<section class="review-area section-gap relative ">
				<div class="overlay overlay-bg"></div>
                                <div class="col-md-12 pb-80 header-text text-center">
							<h1 class="pb-10 text-white">GIVE US YOUR VALUABLE FEEDBACK</h1>
                                                        <h6 class="text-uppercase text-white">CONTACT US</h6><br>
							<p>
								We are excited to listen from you...
							</p>
						</div>
                                
                                <div class="col-lg-6" style="margin-left: 200px;">
				<form class="form-area contact-form text-right" id="myForm" action="feedback" method="post" >    
								<div class="row">	
									<div class="col-lg-6 form-group">
										<input name="name" placeholder="Enter your name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="common-input mb-20 form-control" required="" type="text">
									
										<input name="email" placeholder="Enter email address" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="common-input mb-20 form-control" required="" type="email">

																			</div>
									<div class="col-lg-6 form-group">
										<textarea class="common-textarea form-control" name="message" placeholder="Enter Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Messege'" required=""></textarea>				
									</div>
									<div class="col-lg-12">
										<div class="alert-msg" style="text-align: left;"></div>
                                                                                <input type="submit" value="submit"  style="float: right;"/>										
									</div>
								</div>
							</form>	
                                </div>
                                
                                
			</section>
			<!-- End review Area -->			

			
			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">
					<div class="row">
						<div class="col-lg-7 col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About CUISINE</h6>
								<p>
									We have baked every item from the core of our heart to serve you. Feel free to contact us, we are always ready to help you.
                                                                </p>
                                                                <p>
                                                                We only provide Online Service
                                                                </p>
                                                                    
							</div>
						</div>
										
						<div class="col-lg-5 col-md-6 col-sm-6 social-widget">
							<div class="single-footer-widget">
								<h6>Our Contact</h6>
                                                                <p>Phone:</p>
                                                                <p class="text-primary"> +91-85767584796, +91-8298548952</p>
                                                                
                                                                <p>Email:</p>
                                                                <p class="text-primary"> ya0285981@gmail.com, molyagrawal823@gmail.com</p>
								
							</div>
						</div>	
						<div class="col-lg-12">
							<p class="footer-text"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved 
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>								
						</div>						
					</div>
				</div>
			</footer>	
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
		</body>
	</html>