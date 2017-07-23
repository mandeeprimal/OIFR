package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>OIFR</title>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <!--\r\n");
      out.write("\r\n");
      out.write("    Template 2075 Digital Team\r\n");
      out.write("\r\n");
      out.write("    http://www.tooplate.com/view/2075-digital-team\r\n");
      out.write("\r\n");
      out.write("    -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/et-line-font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nivo-lightbox.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nivo_themes/default/default.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,500' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("    body {background-color: wheat;}\r\n");
      out.write("    h1   {color: blue;}\r\n");
      out.write("    p    {color: green;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar-collapse\" data-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("<!-- preloader section -->\r\n");
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
      out.write("                <form action=\"Login.jsp\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <B> <legend>REGISTATION FORM:</legend></B>\r\n");
      out.write("                        <B><a href=\"#\" >\r\n");
      out.write("                        First Name: <input type = \"text\" name = \"first_word\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                            Middle Name: <input type = \"text\" name = \"middle_word\">\r\n");
      out.write("                          <br><br>\r\n");
      out.write("                        last name: <input type = \"text\" name = \"last_word\">\r\n");
      out.write("                        <br><br>                                             \r\n");
      out.write("                        Gender: <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\r\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\r\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"other\"> Other\r\n");
      out.write("                        <br><br>                   \r\n");
      out.write("                       email id: <input type = \"text\" name = \"Email\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        password:<input type = \"text\" name=\"Password\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("\r\n");
      out.write("                            <input type = \"submit\" value = \"Register\"></a></B>\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("                <hr>\r\n");
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
