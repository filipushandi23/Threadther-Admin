package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.Cinema;
import java.util.List;
import java.util.ArrayList;

public final class showCinemas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>    ");
      out.write("<hr/>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <table border=\"1\" cellpadding=\"5\">\r\n");
      out.write("            <tr><td>NO</td><td>Cinema Name</td><td>Address</td><td>City</td><td>Province</td></tr>\r\n");
      out.write("            ");

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

            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
