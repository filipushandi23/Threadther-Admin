<%-- 
    Document   : assignMovie
    Created on : Apr 19, 2018, 12:41:24 PM
    Author     : Filipus
--%>

<%@page import="services.Movie"%>
<%@page import="services.Studio"%>
<%@page import="services.Cinema"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            boolean loggedin = false;
            if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
                loggedin = true;
                out.println("Welcome admin");
            } else {
                response.sendRedirect("userLogin.jsp");
            }
        %>
        <h1>Assign Movie Schedule</h1>
        <form action="" method="post">
            <table>
                <tr><td>Select Cinema</td><td>
                        <select name="cinema">
                            <%
                                services.WSAdmin_Service service = new services.WSAdmin_Service();
                                services.WSAdmin port = service.getWSAdminPort();
                                List<Cinema> cinemas = port.getAllCinema();

                                for (Cinema c : cinemas) {
                                    out.println("<option value='" + c.getCinemaName() + "'>" + c.getCinemaName() + "</option>");
                                }
                            %>
                        </select>
                    </td></tr>
                <tr><td>Select Studio</td><td>
                        <select>
                            <%
                                List<Studio> studios = port.getStudiosByCinemaName("BEC Mall");

                                for (Studio s : studios) {
                                    out.println("<option value='" + s.getStudioName() + "'>" + s.getStudioName() + "</option>");
                                }
                            %>
                        </select>
                    </td></tr>
                <tr><td>Select Movie</td><td>
                        <select>
                            <%
                                List<Movie> movies = port.getShowingMovies();

                                for (Movie m : movies) {
                                    out.println("<option value='" + m.getTitle() + "'>" + m.getTitle() + "</option>");
                                }
                            %>
                        </select>
                    </td></tr>
                <tr><td>Select Time</td><td>
                        <select>
                            <option>11:00</option>
                            <option>13:00</option>
                            <option>15:00</option>
                            <option>17:00</option>
                            <option>19:00</option>
                        </select>
                    </td></tr>
                <tr><td>Price</td><td><input type="text" name="price"</td></tr>
                <tr><td colspan="2"><input type="submit" value="Assign"></td></tr>
            </table>
        </form>
    </body>
</html>
