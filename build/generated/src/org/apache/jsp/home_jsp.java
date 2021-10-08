package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/headerr.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    \n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\tCSS\n");
      out.write("\t\t\t============================================= -->\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\" id=\"home\">\n");
      out.write("       ");

            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from category");
            
      out.write("\n");
      out.write("\t\t\t    <div class=\"container main-menu\">\n");
      out.write("\t\t\t    \t<div class=\"row align-items-center justify-content-between d-flex\">\n");
      out.write("\t\t\t    \t\t<a href=\"index.html\"><img src=\"img/logo.png\"  width=\"50\" height=\"40\" alt=\"\" title=\"\" /></a>\t\t\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav-menu-container\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-menu\">\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"menu-active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t  <li class=\"menu-has-children\"><a href=\"\">Category</a>\n");
      out.write("\t\t\t\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t\t\t\t     ");

          						  while(rs.next()){
          					  
      out.write("\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"menu.jsp?idd=");
      out.print(rs.getString("cat_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("cat_name"));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t       ");

           							 }
           							 
      out.write("\t\n");
      out.write("           \t\t\t\t\t\t\t  \t\t\t              \n");
      out.write("\t\t\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t   <li class=\"menu-has-children\"><a href=\"#\">User</a>\n");
      out.write("\t\t\t\t\t\t\t   <ul>\n");
      out.write("\t\t\t\t\t\t\t      <!--<li><a href=\"index.jsp\">Login</a></li>-->\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"yourorder.jsp\">Your Order</a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"cart.jsp\">Your Cart</a></li>\n");
      out.write("\t\t\t\t\t\t\t      <li><a href=\"logout.jsp?key1=2\">Logout</a></li>\t\t              \n");
      out.write("\t\t\t\t\t\t\t    </ul></li>\n");
      out.write("                                                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t  <!--<li><a href=\"adminlogin.jsp\">Admin</a></li>-->\n");
      out.write("\t\t\t\t\t\t\t   <!--<li><a href=\"#\">About</a></li>-->\t\t\t\t\t\t\t  \t\t\t          \t          \n");
      out.write("\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav><!-- #nav-menu-container -->\t\t\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </header> <!--#header--> \n");
      out.write("                          ");

                          
                           }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    \t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/popper.min.js\" ></script>\n");
      out.write("\t\t\t<script src=\"js/vendor/bootstrap.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA\"></script>\n");
      out.write("  \t\t\t<script src=\"js/easing.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/superfish.min.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\t\n");
      out.write(" \t\t\t<script src=\"js/jquery-ui.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/owl.carousel.min.js\"></script>\t\t\t\t\t\t\n");
      out.write("\t\t\t<script src=\"js/jquery.nice-select.min.js\"></script>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<script src=\"js/mail-script.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\t\n");
      out.write("\t\t</body>\n");
      out.write("</html>\n");
      out.write('\n');


  // RequestDispatcher rd=getServletContext().getRequestDispatcher("/index.jsp");
   String name=session.getAttribute("name").toString();
   String uid=session.getAttribute("user_id").toString();
   
        if(uid.equals("null")){
             response.sendRedirect("index.jsp");
        }

      out.write("\n");
      out.write("\t<!DOCTYPE html>\n");
      out.write("\t<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("\t");

       response.setHeader("Cache-Control","no-cache");
       response.setHeader("Cache-Control","no-store");
       response.setHeader("Pragma","no-cache");
       response.setDateHeader("Expires",0);
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Mobile Specific Meta -->\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<!-- Favicon -->\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"img/fav.png\">\n");
      out.write("\t\t<!-- Author Meta -->\n");
      out.write("\t\t<meta name=\"author\" content=\"Bakery\">\n");
      out.write("\t\t<!-- Meta Description -->\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<!-- Meta Keyword -->\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t\t<!-- meta character set -->\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<!-- Site Title -->\n");
      out.write("\t\t<title>Bakery</title>\n");
      out.write("\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\tCSS\n");
      out.write("\t\t\t============================================= -->\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\n");
      out.write("                    ");

            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();

            
      out.write("\n");
      out.write("\t<section class=\"banner-area relative\" id=\"home\">\n");
      out.write("\t\t\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row fullscreen d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-content col-lg-10 col-md-12 justify-content-center\">\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"text-uppercase\">Whenever we bake, bake with our heart</h6>\n");
      out.write("\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\tLove with baking items\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-white mx-auto\">\n");
      out.write("\t\t\t\t\t\t\t\tBest Online Bakery of Lucknow.\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                </div>\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End banner Area -->\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Start item-category Area -->\n");
      out.write("\t\t\t<section class=\"item-category-area section-gap\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 pb-80 header-text text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"pb-10\">Category of available items</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tThey are grilling celebrities in their own right.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("                                     ");
 ResultSet rs1=st.executeQuery("select *from category");
      out.write("\n");
      out.write("                                     \n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                            ");
 int i=0;
          						  while(rs1.next()&& i<=4){
                                                              i=i=1;
          					  
      out.write("\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-cat-item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"thumb\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"img/c1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"menu.jsp?idd=");
      out.print(rs1.getString("cat_id"));
      out.write("\"><h4>");
      out.print(rs1.getString("cat_name"));
      out.write("</h4></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(rs1.getString("cat_detail"));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                    ");
 } 
      out.write(" \n");
      out.write("                                                   \n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("<!--                                            <a class=\"primary-btn mx-auto mt-80\" href=\"#\">View Full Menu</a>-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End item-category Area -->\n");
      out.write("                        ");

            							 }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- Start review Area -->\n");
      out.write("\t\t\t<section class=\"review-area section-gap relative \">\n");
      out.write("\t\t\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("                                <div class=\"col-md-12 pb-80 header-text text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"pb-10 text-white\">GIVE US YOUR VALUABLE FEEDBACK</h1>\n");
      out.write("                                                        <h6 class=\"text-uppercase text-white\">CONTACT US</h6><br>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tWe are excited to listen from you...\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-lg-6\" style=\"margin-left: 200px;\">\n");
      out.write("\t\t\t\t<form class=\"form-area contact-form text-right\" id=\"myForm\" action=\"feedback\" method=\"post\" >    \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"name\" placeholder=\"Enter your name\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter your name'\" class=\"common-input mb-20 form-control\" required=\"\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"email\" placeholder=\"Enter email address\" pattern=\"[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter email address'\" class=\"common-input mb-20 form-control\" required=\"\" type=\"email\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea class=\"common-textarea form-control\" name=\"message\" placeholder=\"Enter Messege\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter Messege'\" required=\"\"></textarea>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"alert-msg\" style=\"text-align: left;\"></div>\n");
      out.write("                                                                                <input type=\"submit\" value=\"submit\"  style=\"float: right;\"/>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\t\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End review Area -->\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- start footer Area -->\t\t\n");
      out.write("\t\t\t<footer class=\"footer-area section-gap\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-7 col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>About CUISINE</h6>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tWe have baked every item from the core of our heart to serve you. Feel free to contact us, we are always ready to help you.\n");
      out.write("                                                                </p>\n");
      out.write("                                                                <p>\n");
      out.write("                                                                We only provide Online Service\n");
      out.write("                                                                </p>\n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5 col-md-6 col-sm-6 social-widget\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Our Contact</h6>\n");
      out.write("                                                                <p>Phone:</p>\n");
      out.write("                                                                <p class=\"text-primary\"> +91-8576964227, +91-8299066741</p>\n");
      out.write("                                                                \n");
      out.write("                                                                <p>Email:</p>\n");
      out.write("                                                                <p class=\"text-primary\"> ya0285981@gmail.com, molyagrawal823@gmail.com</p>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"footer-text\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved \n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\t\n");
      out.write("\t\t\t<!-- End footer Area -->\t\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t\t<script src=\"js/vendor/bootstrap.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA\"></script>\n");
      out.write("  \t\t\t<script src=\"js/easing.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/superfish.min.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\t\n");
      out.write(" \t\t\t<script src=\"js/jquery-ui.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/owl.carousel.min.js\"></script>\t\t\t\t\t\t\n");
      out.write("\t\t\t<script src=\"js/jquery.nice-select.min.js\"></script>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<script src=\"js/mail-script.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\t\n");
      out.write("\t\t</body>\n");
      out.write("\t</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
