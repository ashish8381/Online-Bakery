<%-- 
    Document   : message
    Created on : Nov 10, 2018, 9:58:55 PM
    Author     : Ashish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String msg="a";
       msg=request.getParameter("msg");
//        String msg="sdfghjklkjhgfddfghj";
    
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                      <link rel="stylesheet" href="css/bootstrap.min.css">
                      <script src="js/vendor/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>

        <title>Message</title>
    </head>
    <body>
        <%  if(msg.equals("an")){
            out.println("nb");
        %>
<!--        <div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
           <div class="modal-header">
               <h4 class="modal-title">Message Dialog Box </h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
        </div>
        <div class="modal-body">
          <p><%//=msg%></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
    </div>
</div>
</div> -->
        <% } else{ %>
        <div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
           <div class="modal-header">
               <h4 class="modal-title">Message Dialog Box </h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
        </div>
        <div class="modal-body">
          <p><%=msg%></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
    </div>
</div>
</div> 
        
      
        
        
        <script type="text/javascript">
    $(document).ready(function(){
        $("#myModal").modal('show');
    });
</script>
  <% }%>
    </body>
</html>
