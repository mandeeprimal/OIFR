package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!--\r\n");
      out.write("Template Name: GreyScale Business\r\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\r\n");
      out.write("Author URI: http://www.os-templates.com/\r\n");
      out.write("Licence: Free to use under our free template licence terms\r\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>GreyScale Business</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("    <div id=\"head\">\r\n");
      out.write("        <h1><a href=\"index.html\">GreyScale Business</a></h1>\r\n");
      out.write("        <p>Free Website Template</p>\r\n");
      out.write("        <div id=\"topnav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a class=\"active\" href=\"index.html\">Home</a></li>\r\n");
      out.write("                <li><a href=\"pages/style-demo.html\">Style Demo</a></li>\r\n");
      out.write("                <li><a href=\"pages/full-width.html\">Full Width</a></li>\r\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                <li class=\"last\"><a href=\"#\">A Long Link Text</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"search\">\r\n");
      out.write("            <form action=\"#\" method=\"post\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>Site Search</legend>\r\n");
      out.write("                    <input type=\"submit\" name=\"go\" id=\"go\" value=\"GO\" />\r\n");
      out.write("                    <input type=\"text\" value=\"Search the site&hellip;\"  onfocus=\"this.value=(this.value=='Search the site&hellip;')? '' : this.value ;\" />\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <div id=\"intro\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/130x330.gif\" alt=\"\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/130x330.gif\" alt=\"\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/130x330.gif\" alt=\"\" /></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/130x330.gif\" alt=\"\" /></a></li>\r\n");
      out.write("            <li class=\"featured\">\r\n");
      out.write("                <h2>Latest Featured Information</h2>\r\n");
      out.write("                <p class=\"imgholder\"><img src=\"images/demo/280x70.gif\" alt=\"\" /></p>\r\n");
      out.write("                <p>This is a free website template from <a href=\"http://www.os-templates.com/\">OS Templates</a> and is distributed using a <a href=\"http://www.os-templates.com/template-terms\">Website Template Licence</a>, which allows you to use and modify the template for both personal and commercial use when you keep the provided credit links in the footer.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Continue Reading This Article &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <!-- Content Box -->\r\n");
      out.write("    <div class=\"homecontent\">\r\n");
      out.write("        <h2>Adipisciniapellentum Consequam</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"last\">\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"last\">\r\n");
      out.write("                <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\r\n");
      out.write("                <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\r\n");
      out.write("                <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- / Content Box -->\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col2\">\r\n");
      out.write("    <div id=\"projects\">\r\n");
      out.write("        <h2>Our Latest Projects</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/290x290.gif\" alt=\"\" /><strong>Read More About This Project &raquo;</strong></a></li>\r\n");
      out.write("            <li><a href=\"#\"><img src=\"images/demo/290x290.gif\" alt=\"\" /><strong>Read More About This Project &raquo;</strong></a></li>\r\n");
      out.write("            <li class=\"last\"><a href=\"#\"><img src=\"images/demo/290x290.gif\" alt=\"\" /><strong>Read More About This Project &raquo;</strong></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("        <div id=\"contactform\">\r\n");
      out.write("            <h2>Why Not Contact Us Today !</h2>\r\n");
      out.write("            <form action=\"#\" method=\"post\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend>Contact Form</legend>\r\n");
      out.write("                    <label for=\"fullname\">Name:\r\n");
      out.write("                        <input id=\"fullname\" name=\"fullname\" type=\"text\" value=\"\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"emailaddress\" class=\"margin\">Email:\r\n");
      out.write("                        <input id=\"emailaddress\" name=\"emailaddress\" type=\"text\" value=\"\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"phone\">Telephone:\r\n");
      out.write("                        <input id=\"phone\" name=\"phone\" type=\"text\" value=\"\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"subject\" class=\"margin\">Subject:\r\n");
      out.write("                        <input id=\"subject\" name=\"subject\" type=\"text\" value=\"\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label for=\"message\">Message:<br />\r\n");
      out.write("                        <textarea id=\"message\" name=\"message\" cols=\"40\" rows=\"4\"></textarea>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <input id=\"submitform\" name=\"submitform\" type=\"submit\" value=\"Submit\" />\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input id=\"resetform\" name=\"resetform\" type=\"reset\" value=\"Reset\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Contact Form -->\r\n");
      out.write("        <div id=\"compdetails\">\r\n");
      out.write("            <div id=\"officialdetails\">\r\n");
      out.write("                <h2>Company Information !</h2>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Company Name Ltd</li>\r\n");
      out.write("                    <li>Registered in England &amp; Wales</li>\r\n");
      out.write("                    <li>Company No. xxxxxxx</li>\r\n");
      out.write("                    <li class=\"last\">VAT No. xxxxxxxxx</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <h2>Stay in The Know !</h2>\r\n");
      out.write("                <p><a href=\"#\">Get Our E-Newsletter</a> | <a href=\"#\">Grab The RSS Feed</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"contactdetails\">\r\n");
      out.write("                <h2>Our Contact Details !</h2>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Company Name</li>\r\n");
      out.write("                    <li>Street Name &amp; Number</li>\r\n");
      out.write("                    <li>Town</li>\r\n");
      out.write("                    <li>Postcode/Zip</li>\r\n");
      out.write("                    <li>Tel: xxxxx xxxxxxxxxx</li>\r\n");
      out.write("                    <li>Fax: xxxxx xxxxxxxxxx</li>\r\n");
      out.write("                    <li>Email: info@domain.com</li>\r\n");
      out.write("                    <li class=\"last\">LinkedIn: <a href=\"#\">Company Profile</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Company Details -->\r\n");
      out.write("        <div id=\"copyright\">\r\n");
      out.write("            <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"#\">Domain Name</a></p>\r\n");
      out.write("            <p class=\"fl_right\">Template by <a target=\"_blank\" href=\"http://www.os-templates.com/\" title=\"Free Website Templates\">OS Templates</a></p>\r\n");
      out.write("            <br class=\"clear\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("    </div>\r\n");
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
