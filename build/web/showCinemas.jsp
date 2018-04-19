<%-- 
    Document   : showCinemas
    Created on : Mar 17, 2018, 7:15:49 PM
    Author     : Filipus
--%>


<%@page import="services.Cinema"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>    <%-- start web service invocation --%><hr/>
    <%
        boolean loggedin = false;
        if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
            loggedin = true;
            out.println("Welcome admin");
        } else {
            response.sendRedirect("userLogin.jsp");
        }
    %>

    <body>
        <table border="1" cellpadding="5">
            <tr><td>NO</td><td>Cinema Name</td><td>Address</td><td>City</td><td>Province</td></tr>
            <%
                try {
                    services.WSAdmin_Service service = new services.WSAdmin_Service();
                    services.WSAdmin port = service.getWSAdminPort();
                    List<Cinema> cinemas = port.getAllCinema();

                    for (int i = 0; i < cinemas.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + (i + 1) + "</td>");
                        out.println("<td><a href='showStudios.jsp?name=" + cinemas.get(i).getCinemaName() + "'>" + cinemas.get(i).getCinemaName() + "</a></td>");
                        out.println("<td>" + cinemas.get(i).getAddress() + "</td>");
                        out.println("<td>" + cinemas.get(i).getCity() + "</td>");
                        out.println("<td>" + cinemas.get(i).getProvince() + "</td>");
                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            %>
        </table>
    </body>
</html>
