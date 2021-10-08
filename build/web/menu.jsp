    <%@page import="java.sql.*"%>
    <%@include file="/headerr.jsp" %>
    
    <%
    String ss ="";
    %>
    
    <%
   String cat=request.getParameter("idd");
%>
   

	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Bakery</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
                
		<!--CSS============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/jquery-ui.css">			
			<link rel="stylesheet" href="css/owl.carousel.css">
			<link rel="stylesheet" href="css/main.css">
                        <link rel="stylesheet" href="css/core-style.css">
                        <link rel="stylesheet" href="css/style.css">
		</head>
		<body>	
		
			   	 <% 
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from category");
            %>
			   
							 
							    	
           							  	              
							    

			<!-- start banner Area -->
			<section class="banner-area relative about-banner" id="home">	
				<div class="overlay overlay-bg"></div>
				<div class="container">				
					<div class="row d-flex align-items-center justify-content-center">
						<div class="about-content col-lg-12">
							<h1 class="text-white">
								Menu List				
							</h1>	
							<p class="text-white link-nav"><a href="index.html">Home </a>  <span class="lnr lnr-arrow-right"></span>  <a href="menu.html"> Menu</a></p>
						</div>	
					</div>
				</div>
			</section>
                        
			
       <div class="menu-list-area section-gap">
            <div class="container">
                  
                                            
                <div class="row">
                    <div class="col-12 col-lg-12">
                        <div class="cart-title mt-50">
                            <h2>Add to Cart</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Name</th>
                                        <th></th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th></th>
                                        <th>Add to Cart</th>
                                         <th></th>  
                                        <th>Order Now</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    
                                    <%ResultSet rs1 = st.executeQuery("select *from product where catgory_id='"+cat+"'");%>
                                     <%
          						  while(rs1.next()){
                                                              ss= rs1.getString("pro_id");
          					  %>
                                    <tr>
                                        <td class="cart_product_img">
                                            <a href="#"><img src="img/b2.jpg" width="200" height="200" alt="Product"></a>
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5><%=rs1.getString("pro_name")%></h5>
                                        </td>
                                        <td></td>
                                        <td class="price">
                                            <span><%=rs1.getString("pro_price")%></span>
                                        </td>
                                       
                                        <td class="qty">
                                             <span>1</span>
<!--                                            <div class="qty-btn d-flex">
                                               <div class="quantity">
                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                    <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="qtyy" value="1">
                                                    <span class="qty-plus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                </div>
                                            </div>-->
                                        </td>
                                         <td></td>
                                        <td>
                                            <!--<form action="cart" method="post"-->
                                    <!--<input class="btn btn-success add-cart-btn" type="submit" value="Add">--> 
                                    <button class="btn btn-reply "><a href="cart?proo=<%=ss%>" class="text-white" >ADD TO CART</a></button>
                                            <!--</form>-->
                                        </td>
                                         <td></td>
                                        <td>
                                       
                                            <button class="btn btn-success"><a href="order.jsp?proo=<%=ss%>" class="text-white" >Buy</a></button>
                                     
                                        </td>
                                    </tr>
                                      <% } %>
                                     
                                   
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
       </div>
			<!-- End item-category Area -->
                        
                        <%
            							 }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 %>

                    
                    
                    
                    
                    

				    																			
			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">
					<div class="row">
						<div class="col-lg-5 col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About Us</h6>
								<p>
									If you own an Iphone, you’ve probably already worked out how much fun it is to use it to watch movies-it has that.
								</p>							
							</div>
						</div>
						<div class="col-lg-5  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Newsletter</h6>
								<p>Stay update with our latest</p>
								<div class="" id="mc_embed_signup">
									<form target="_blank" novalidate="true" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="form-inline">
										<input class="form-control" name="EMAIL" placeholder="Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email Address'" required="" type="email">
			                            	<button class="click-btn"><i class="lnr lnr-arrow-right" aria-hidden="true"></i></button>
			                            	<div style="position: absolute; left: -5000px;">
												<input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
											</div>
										<div class="info"></div>
									</form>
								</div>
							</div>
						</div>						
						<div class="col-lg-2 col-md-6 col-sm-6 social-widget">
							<div class="single-footer-widget">
								<h6>Follow Us</h6>
								<p>Let us be social</p>
								<div class="footer-social d-flex align-items-center">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-behance"></i></a>
								</div>
							</div>
						</div>	
							
						<div class="col-lg-12">
							<p class="footer-text"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>								
						</div>													
					</div>
				</div>
			</footer>	
			<!-- End footer Area -->	

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
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
                        
                         <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
                         <script src="js/jquery/jquery-2.2.4.min.js"></script>
                         <!-- Popper js -->
                         <script src="js/popper.min.js"></script>
                         <!-- Bootstrap js -->
                         <script src="js/bootstrap.min.js"></script>
                         <!-- Plugins js -->
                         <script src="js/plugins.js"></script>
                         <!-- Active js -->
                         <script src="js/active.js"></script>
		</body>
	</html>