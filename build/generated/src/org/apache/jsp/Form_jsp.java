package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>OIFR</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row0\">\r\n");
      out.write("    <div id=\"topbar\" class=\"hoc clear\">\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("        <div class=\"fl_left\">\r\n");
      out.write("            <ul class=\"nospace inline pushright\">\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row1\">\r\n");
      out.write("    <header id=\"header\" class=\"hoc clear\">\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("        <div id=\"logo\" class=\"fl_left\">\r\n");
      out.write("            <h1><a href=\"Form.jsp\"><img src=\"image1.jpg\" alrt= \"C:\\Users\\user\\IdeaProjects\\Admin1\\web\" style=\"width:200px;height:80px;\"><H>ONLINE IOE FORM REGISTRATION</H> </a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"search\" class=\"fl_right\">\r\n");
      out.write("            <form class=\"clear\" method=\"post\" action=\"#\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>Search:</legend>\r\n");
      out.write("                    <input type=\"search\" value=\"\" placeholder=\"Search Here&hellip;\">\r\n");
      out.write("                    <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("    </header>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<div class=\"wrapper row2\">\r\n");
      out.write("    <nav id=\"mainav\" class=\"hoc clear\">\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("        <ul class=\"clear\">\r\n");
      out.write("            <li class=\"active\"><a href=\"Form.jsp\">Home</a></li>\r\n");
      out.write("            <li><a class=\"drop\" href=\"#\">PROGRAM</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"pages/gallery.html\">BE in CIVIL</a></li>\r\n");
      out.write("                    <li><a href=\"pages/full-width.html\">BE in COMPUTER</a></li>\r\n");
      out.write("                    <li><a href=\"pages/sidebar-left.html\">BE in ELECTRONIC</a></li>\r\n");
      out.write("                    <li><a href=\"pages/sidebar-right.html\">BE in ELECTRICAL</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li><a class=\"active\"> <a href=\"page.jsp\">LIST</a> </a></li>\r\n");
      out.write("            <li><a href=\"#\">SETTING</a></li>\r\n");
      out.write("            <li><a href=\"#\">ABOUT US</a></li>\r\n");
      out.write("            <li><a href=\"#\"> NOTICE</a> </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper bgded overlay\" style=\"background-image:url('image2.jpg')\" >\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"hoc container clear\">\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("        <article class=\"center\">\r\n");
      out.write("            <h2 class=\"font-x3 uppercase\">WELCOME TO OIFR ADMINISTRATION</h2>\r\n");
      out.write("\r\n");
      out.write("            <footer>\r\n");
      out.write("                <ul class=\"nospace inline pushright\">\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </article>\r\n");
      out.write("        <!-- ################################################################################################ -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("<!-- ################################################################################################ -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"layout/scripts/jquery.backtotop.js\"></script>\r\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\r\n");
      out.write("<!-- IE9 Placeholder Support -->\r\n");
      out.write("<script src=\"layout/scripts/jquery.placeholder.min.js\"></script>\r\n");
      out.write("<!-- / IE9 Placeholder Support -->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
