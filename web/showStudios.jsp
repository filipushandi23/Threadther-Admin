<%-- 
    Document   : showStudios
    Created on : Mar 28, 2018, 9:17:15 PM
    Author     : Filipus
--%>

<%@page import="services.Studio"%>
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
        if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
            loggedin = true;
            out.println("Welcome admin");
        } else {
            response.sendRedirect("userLogin.jsp");
        }
    %>
    <body>
        <%
            try {
                services.WSAdmin_Service service = new services.WSAdmin_Service();
                services.WSAdmin port = service.getWSAdminPort();
                String name = request.getParameter("name");
                if (name != null || !name.equals("")) {
                    out.println("<h2>Studio list for Cinema : " + name + "</h2>");
                    List<Studio> studioList = port.getStudiosByCinemaName(name);
                    out.println("<table border='1' cellpadding='5'>");
                    out.println("<tr><td>Studio Number</td><td>Studio Name</td><td>Cols</td><td>Rows</td></tr>");
                    for (Studio studio : studioList) {
                        out.println("<tr>");
                        out.println("<td>" + studio.getStudioNumber() + "</td>");
                        out.println("<td>" + studio.getStudioName() + "</td>");
                        out.println("<td>" + studio.getColCapacity() + "</td>");
                        out.println("<td>" + studio.getRowCapacity() + "</td>");
                        out.println("</tr>");
                    }
                    out.println("</table>");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        %>
    </body>
</html>
