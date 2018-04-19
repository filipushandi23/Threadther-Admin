<%-- 
    Document   : showTest
    Created on : Mar 17, 2018, 12:49:25 PM
    Author     : Filipus
--%>


<%@page import="services.Schedule"%>
<%@page import="services.Movie"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
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
    <body>
        <table border="1" cellpadding="5">
            <tr><td>Title</td><td>Poster</td><td>Duration</td><td>Schedule</td></tr>
            <%
                services.WSAdmin_Service service = new services.WSAdmin_Service();
                services.WSAdmin port = service.getWSAdminPort();
                List<Movie> movies = port.getShowingMovies();
                List<Schedule> schedules = new ArrayList();
                
                for (Movie movie : movies) {
                    out.println("<tr>");
                    out.println("<td>" + movie.getTitle() + "</td>");
                    out.println("<td><img src='" + movie.getPoster() + "' width='182px' height='268px'></td>");
                    out.println("<td> " + movie.getDuration() + "minutes </td>");
                    out.println("<td><ul>");
                    schedules = port.getAllScheduleByMovieId(movie.getMovieId());
                    for (Schedule s : schedules) {
                        out.println("<li>"+s.getId().getMovieStart() + "  in "+s.getStudio().getStudioName()
                                +" at "+s.getStudio().getCinema().getCinemaName()+"</li>");
                    }
                    out.println("</ul></td>");
                    out.println("</tr>");
                }
            %>
        </table>
    </body>
</html>
