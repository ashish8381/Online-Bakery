<%--
    Document   : home
    Created on : 22 Jul, 2018, 11:38:07 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   //String name=session.getAttribute("name").toString();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%//=name%></title>
             <link href="assets/css/bootstrap.css"
             rel="stylesheet" type="text/css"/>
             <link rel="stylesheet" href="assets/css/carousel.css"/>
 </head>
    <body>
        <div class="container-fluid text-center">
    <div class="row" >
    <header class="col-lg-12 text-white " style="background-color: #455a64;">
      <nav class="navbar navbar-expand-lg navbar-dark fixed-top text-white  " style="background-color: #ffd54f;">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="#navbarSupportedContent" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
     <ul class="navbar-nav mr-auto">
      <li class="nav-item active"><a class="nav-link text-white" href="#">Home<span class="sr-only">(current)</span></a></li>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle text-dark" href="#" id="navbarDropdown" role="button"  data-toggle="dropdown" aria-haspopup="true" >Dropdown</a>
        <div class="dropdown-menu text-dark bg-danger" aria-labelledby="navbarDropdown">
          <a class="dropdown-item text-white" href="#">Action</a>
          <a class="dropdown-item text-white" href="#">Reaction</a>
          <a class="dropdown-item text-white" href="#">Transaction</a>
          <a class="dropdown-item text-white" href="#">Reflection</a>
          <div class="dropdown-divider">
          </div>
          <a class="dropdown-item text-white" href="#">Something else here</a>
        </div>
      </li>
       <li class="nav-item"><a class="nav-link text-white" href="#" >Extra</a></li>
       <li class="nav-item"><a class="nav-link text-white" href="#">Contact us</a></li>
       <li class="nav-item"><a class="nav-link text-white" href="adminlogin.jsp">Admin</a></li>
       <li class="nav-item"><a class="nav-link text-white" href="#">Logout</a></li>
       <li class="nav-item">
         <a class="nav-link disabled" href="#">Disabled</a>
       </li>
     </ul>
     <form class="form-inline my-2 my-lg-0">
       <input class="form-control mr-sm-2" type="search" placeholder="search" aria-label="Search">
       <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
     </form>
   </div>
     </nav>
    </header>
    </div>
    <div style="height: 1300px; display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  margin-right: -45px;
  margin-left: -25px;">
    <section class="col-lg-12 text-white" style="background-color: #fef0a4; margin-left: -15px; width: 100%;">
        <!-- Carousal -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
              <img class="first-slide" src="http://www.mrbrownbakery.com/media/revslider/Banner1.jpg" alt="First slide">
            <div class="container">
              <div class="carousel-caption text-left">
                <h1>Example headline.</h1>
                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img class="second-slide" src="assets/images/banner2.jpg" alt="Second slide">
            <div class="container">
              <div class="carousel-caption">
                <h1>Another example headline.</h1>
                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img class="third-slide" src="assets/images/banner3.jpg" alt="Third slide">
            <div class="container">
              <div class="carousel-caption text-right">
                <h1>One more for good measure.</h1>
                <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
              </div>
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>   
        
        
      <div class="row" style="margin-top: 810px; height: 96px; padding: 20px 0">
      <footer class="col-lg-12 bg-warning text-white">
      Footer
      </footer>
       </div>
    </section>
  </div>
</div>
   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery-3.3.1.slim.min.js"></script>
    <script src="assets/js/popper.min.js" ></script>
    <script src="assets/js/bootstrap.min.js"></script>
  </body>
</html>
