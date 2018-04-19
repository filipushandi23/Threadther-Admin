package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import services.Movie;
import java.util.ArrayList;

public final class showMovies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        boolean loggedin = false;
        if (!(session.getAttribute("userid") == null || session.getAttribute("userid").equals(""))) {
            loggedin = true;
            out.println("Welcome admin");
        } else {
            response.sendRedirect("userLogin.jsp");
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <a href=\"insertMovies.jsp\">Insert Movies</a>\r\n");
      out.write("        <table border=\"1\" cellpadding=\"5\">\r\n");
      out.write("            <tr><td>NO</td><td>Title</td><td>Synopsis</td><td>Rating</td><td>Duration</td><td>Poster</td></tr>\r\n");
      out.write("            ");

                services.WSAdmin_Service service = new services.WSAdmin_Service();
                services.WSAdmin port = service.getWSAdminPort();
                List<Movie> movies = port.getAllMovie();

                for (int i = 0; i < movies.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + movies.get(i).getMovieId() + "</td>");
                    out.println("<td>" + movies.get(i).getTitle() + "</td>");
                    out.println("<td>" + movies.get(i).getSynopsis() + "</td>");
                    out.println("<td>" + movies.get(i).getRating() + "</td>");
                    out.println("<td>" + movies.get(i).getDuration() + "</td>");
                    out.println("<td><img src='" + movies.get(i).getPoster() + "' width='182px' height='268px'></td>");
                    out.println("<td><a href='updateMovies.jsp?m_id=" + movies.get(i).getMovieId()
                            + "'><button>Update</button></a></td>");
                    out.println("<td><a href='DeleteMovie?m_id=" + movies.get(i).getMovieId()
                            + "'><button>Delete</button></a></td>");
                    out.println("</tr>");
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
