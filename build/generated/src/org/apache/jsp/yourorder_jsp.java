package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class yourorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
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
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

    String ss ="";
    String sss;
    
     ss=session.getAttribute("user_id").toString();
    
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("\t<!DOCTYPE html>\n");
      out.write("\t<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Mobile Specific Meta -->\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<!-- Favicon-->\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"img/fav.png\">\n");
      out.write("\t\t<!-- Author Meta -->\n");
      out.write("\t\t<meta name=\"author\" content=\"colorlib\">\n");
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
      out.write("                \n");
      out.write("\t\t<!--CSS============================================= -->\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("                        <link rel=\"stylesheet\" href=\"css/core-style.css\">\n");
      out.write("                        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t\t</head>\n");
      out.write("\t\t<body>\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t   \t ");
 
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery_db", "root", "77492652");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from orders where user_id='"+ss+"'");
            
            
           
            
      out.write("\n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t    \t\n");
      out.write("           \t\t\t\t\t\t\t  \t              \n");
      out.write("\t\t\t\t\t\t\t    \n");
      out.write("\n");
      out.write("\t\t\t<!-- start banner Area -->\n");
      out.write("\t\t\t<section class=\"banner-area relative about-banner\" id=\"home\">\t\n");
      out.write("\t\t\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("\t\t\t\t<div class=\"container\">\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"row d-flex align-items-center justify-content-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"about-content col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"text-white\">\n");
      out.write("\t\t\t\t\t\t\t\tYour Orders\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</h1>\t\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-white link-nav\"><a href=\"index.html\">Home </a>  <span class=\"lnr lnr-arrow-right\"></span>  <a href=\"menu.html\"> Menu</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("                        \n");
      out.write("\t\t\t\n");
      out.write("       <div class=\"menu-list-area section-gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                  \n");
      out.write("                                            \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-lg-12\">\n");
      out.write("                        <div class=\"cart-title mt-50 \" style=\" \">\n");
      out.write("                            <h2>Add to Cart</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cart-table clearfix\">\n");
      out.write("                            <table class=\"table table-responsive\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>Product Name</th>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>order Date</th>\n");
      out.write("                                        <th></th>  \n");
      out.write("                                        <th>Cancel Order</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                         \n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
 while(rs.next()){
                                        sss =rs.getString("order_id");
                
      out.write("\n");
      out.write("                         \n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <td class=\"cart_product_img\">\n");
      out.write("                                            <a href=\"#\"><img src=\"img/b2.jpg\" width=\"200\" height=\"200\" alt=\"Product\"></a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"cart_product_desc\">\n");
      out.write("                                            <h5>");
      out.print(rs.getString("pro_name"));
      out.write("</h5>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td class=\"price\">\n");
      out.write("                                            <span>");
      out.print(rs.getString("pro_price"));
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                       \n");
      out.write("                                         <td class=\"price\">\n");
      out.write("                                            <span>");
      out.print(rs.getString("order_qty"));
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                         <td></td>\n");
      out.write("                                         <td class=\"price\">\n");
      out.write("                                            <span>");
      out.print(rs.getString("order_date"));
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                         <td></td>\n");
      out.write("                                         <td>\n");
      out.write("                                           \n");
      out.write("                                      <button class=\"btn btn-primary btn-lg\"> <a href=\"cancel_order.jsp?order_id=");
      out.print(sss);
      out.write("\" class=\"text-white\" >Cancel Order</a></button>\n");
      out.write("                                        </td>\n");
      out.write("<!--                                        <td>\n");
      out.write("                                       \n");
      out.write("                                            <button class=\"btn btn-success\"><a href=\"order.jsp?proo=\" class=\"text-white\" >Buy</a></button>\n");
      out.write("                                     \n");
      out.write("                                        </td>-->\n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                                      \n");
      out.write("                                      ");
 } 
      out.write("\n");
      out.write("                                      </tbody>\n");
      out.write("                                      \n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("\t\t\t<!-- End item-category Area -->\n");
      out.write("                        \n");
      out.write("                        ");

            							 }
           								 catch(Exception e) {
           								 out.println("Error Message while insertion: " + e);
      									  }

   										 
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("\t\t\t<!-- Start about-video Area -->\n");
      out.write("\t\t\t<section class=\"about-video-area section-gap\">\n");
      out.write("\t\t\t\t<div class=\"container\">\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"row align-items-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 about-video-left\">\n");
      out.write("\t\t\t\t\t\t\t<h6 class=\"text-uppercase\">Brand new app to blow your mind</h6>\n");
      out.write("\t\t\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t\t\tWeâve made a life <br>\n");
      out.write("\t\t\t\t\t\t\t\tthat will change you \n");
      out.write("\t\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<span>We are here to listen from you deliver exellence</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed doeiusmo d tempor incididunt ut labore et dolore magna aliqua.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"primary-btn\" href=\"#\">Get Started Now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 about-video-right justify-content-center align-items-center d-flex\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"play-btn\" href=\"https://www.youtube.com/watch?v=ARA0AxrnHdM\"><img class=\"img-fluid mx-auto\" src=\"img/play.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End about-video Area -->\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t    \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<!-- start footer Area -->\t\t\n");
      out.write("\t\t\t<footer class=\"footer-area section-gap\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5 col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>About Us</h6>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tIf you own an Iphone, youâve probably already worked out how much fun it is to use it to watch movies-it has that.\n");
      out.write("\t\t\t\t\t\t\t\t</p>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-5  col-md-6 col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Newsletter</h6>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Stay update with our latest</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"\" id=\"mc_embed_signup\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form target=\"_blank\" novalidate=\"true\" action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\" method=\"get\" class=\"form-inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"EMAIL\" placeholder=\"Email Address\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Email Address'\" required=\"\" type=\"email\">\n");
      out.write("\t\t\t                            \t<button class=\"click-btn\"><i class=\"lnr lnr-arrow-right\" aria-hidden=\"true\"></i></button>\n");
      out.write("\t\t\t                            \t<div style=\"position: absolute; left: -5000px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"b_36c4fd991d266f23781ded980_aefe40901a\" tabindex=\"-1\" value=\"\" type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"info\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-6 col-sm-6 social-widget\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-footer-widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Follow Us</h6>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Let us be social</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer-social d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"footer-text\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\t\n");
      out.write("\t\t\t<!-- End footer Area -->\t\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
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
      out.write("\t\t\t<script src=\"js/main.js\"></script>\n");
      out.write("                        \n");
      out.write("                         <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\n");
      out.write("                         <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("                         <!-- Popper js -->\n");
      out.write("                         <script src=\"js/popper.min.js\"></script>\n");
      out.write("                         <!-- Bootstrap js -->\n");
      out.write("                         <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                         <!-- Plugins js -->\n");
      out.write("                         <script src=\"js/plugins.js\"></script>\n");
      out.write("                         <!-- Active js -->\n");
      out.write("                         <script src=\"js/active.js\"></script>\n");
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
