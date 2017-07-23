package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/et-line-font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nivo-lightbox.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nivo_themes/default/default.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,500' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        body {background-color: wheat;}\r\n");
      out.write("        h1   {color: blue;}\r\n");
      out.write("        p    {color: green;}\r\n");
      out.write("    </style>\r\n");
      out.write("       <title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar-collapse\" data-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"preloader\">\r\n");
      out.write("    <div class=\"sk-spinner sk-spinner-circle\">\r\n");
      out.write("        <div class=\"sk-circle1 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle2 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle3 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle4 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle5 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle6 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle7 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle8 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle9 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle10 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle11 sk-circle\"></div>\r\n");
      out.write("        <div class=\"sk-circle12 sk-circle\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- navigation section -->\r\n");
      out.write("<section class=\"navbar navbar-fixed-top custom-navbar\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                <span class=\"icon icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"><middle>ONLINE IOE FORM RGISTRATION</middle></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- home section -->\r\n");
      out.write("<section id=\"home\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("        <form method=\"post\" action=\"Form.jsp\">\r\n");
      out.write("            <center>\r\n");
      out.write("            <table border=\"1\" width=\"30%\" cellpadding=\"3\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\">Login Here</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><a href=\"#\">User Name</a></td>\r\n");
      out.write("                 <td>   <a href=\"#\"><input type=\"text\" name=\"uname\" value=\"\" required=\"required\"/></a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                   <td><a href=\"#\">Password</a></td>\r\n");
      out.write("                   <td><a href=\"#\"><input type=\"password\" name=\"pass\" value=\"\" required=\"required\"/></a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><a href=\"#\"><input type=\"submit\" value=\"Login\" required=\"required\"/></a></td>\r\n");
      out.write("                        <td><a href=\"#\"><input type=\"reset\" value=\"Reset\" required=\"required\"/></a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td colspan=\"2\">Yet Not Registered!! <a href=\"reg.jsp\">Register Here</a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </center>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- work section -->\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/smoothscroll.js\"></script>\r\n");
      out.write("<script src=\"js/isotope.js\"></script>\r\n");
      out.write("<script src=\"js/imagesloaded.min.js\"></script>\r\n");
      out.write("<script src=\"js/nivo-lightbox.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.backstretch.min.js\"></script>\r\n");
      out.write("<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
