package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Template_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("table, th, td{\n");
      out.write("padding: 5px;\n");
      out.write("border-spacing: 15px;\n");
      out.write("}\n");
      out.write("table#t01, td, th {\n");
      out.write("<!--border: 1px solid black;-->\n");
      out.write("padding: 5px;\n");
      out.write("border-spacing: 15px;\n");
      out.write("<!--border-collapse: collapse-->\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h3 style=\"text-align:center\"><img src = \"/Users/swetamac/Desktop/project template/TUlogo.jpg\" alt = \"TU Logo\" width = \"100\" height=\"100\"></h3> \n");
      out.write("<h5 style =\"text-align:center;font-family:verdana\">Tribhuvan University</h5>\n");
      out.write("<h4 style =\"text-align:center;font-family:verdana\">Institute of Engineering</h4>\n");
      out.write("<h2 style = \"text-align:center;font-family:verdana\">B.E./B.Arch Examination Control Board</h2>\n");
      out.write("<p style = \"text-align:center;font-family:courier\"><em>Chakupat,Lalitpur</em></p>\n");
      out.write("<hr>\n");
      out.write("<h2 style =\"text-align:center;font-family:arial\"><b>IOE BOARD EXAMINATION FORM </b></h2>\n");
      out.write("<br>\n");
      out.write("<table style = \"width:50%\">\n");
      out.write("<img src=\"/Users/swetamac/Desktop/project template/user.png\" alt = \"User pic\" style = \"float:right;width:260px;height:300px\">\n");
      out.write("<!--<img src=\"#LOGO#x\" alt = \"User pic\" style = \"float:right;width:260px;height:300px\">-->\n");
      out.write("<tr>\n");
      out.write("<td><b>First Name:</b></td>\n");
      out.write("<td>#FIRST_NAME#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Last Name:</b></td>\n");
      out.write("<td>#LAST_NAME#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Date of Birth:</b></td>\n");
      out.write("<td>#DOB#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Gender:</b></td>\n");
      out.write("<td>#GENDER#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>College Name:</b></td>\n");
      out.write("<td>#COLLEGE_NAME#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>College RollNumber:</b></td>\n");
      out.write("<td>#COLLEGE_ROLL_NUMBER#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Faculty:</b></td>\n");
      out.write("<td>#FACULTY#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Year:</b></td>\n");
      out.write("<td>#YEAR#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Semester:</b></td>\n");
      out.write("<td>#SEMESTER#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Date of Examination:</b></td>\n");
      out.write("<td>#DATE_OF_EXAMINATION#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Type of Examination:</b></td>\n");
      out.write("<td>#TYPE_OF_EXAMINATION#</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><b>Bank Voucher Number:</b></td>\n");
      out.write("<td>#VOUCHER_NUMBER#</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<table id= \"t01\" style =\"width:50%\" align = \"center\">\n");
      out.write("<img src=\"/Users/swetamac/Desktop/project template/signature.jpg\" alt = \"User pic\" style = \"float:right;width:200px;height:200px\">\n");
      out.write("<caption><strong><i>List of Subjects</i></strong></caption>\n");
      out.write("<tr>\n");
      out.write("<th>S.No.</th>\n");
      out.write("<th>Code No.</th>\n");
      out.write("<th>Subject Name</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>#S.No#</td>\n");
      out.write("<td>#CODE_NO#</td>\n");
      out.write("<td>#SUBJECT_NAME#</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<p style =\"text-align:right;font-size:150%\"><b><u>Signature of Student</u></b></p>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
