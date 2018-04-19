<%-- 
    Document   : home
    Created on : Apr 19, 2018, 11:57:37 AM
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
        <h1>Admin Page</h1><a href="logout.jsp">Logout</a>
        <ul>
            <li><a href="insertMovies.jsp">Insert Movies</a></li>
            <li><a href="showCinemas.jsp">Show Cinemas</a></li>
            <li><a href="showMovies.jsp">Show Movies</a></li>
            <li><a href="assignMovie.jsp">Assign Movies Schedule</a></li>
            <li><a href="showMovieSchedule.jsp">Show Movies Schedule</a></li>
        </ul>
        <%
            boolean loggedin = false;
            if (!(session.getAttribute("userid")== null || session.getAttribute("userid").equals(""))) {
                loggedin = true;
                out.println("Welcome admin");
            }
            else{
                response.sendRedirect("userLogin.jsp");
            }
        %>
    </body>
</html>
