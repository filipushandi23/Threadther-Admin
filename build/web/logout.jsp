<%-- 
    Document   : logout
    Created on : Apr 19, 2018, 12:36:13 PM
    Author     : Filipus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("userid", null);
            session.invalidate();
            response.sendRedirect("userLogin.jsp");
        %>
    </body>
</html>
