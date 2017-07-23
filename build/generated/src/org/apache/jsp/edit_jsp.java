package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import listpac.Student;
import dao.StudentDAO;
import impl.StudentDAOlmp;
import static java.lang.Integer.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link href=\"assets/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/html\">\r\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"> </script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    Student std = new Student();
    if(request.getParameter("id")==null || request.getParameter("id").isEmpty())
    {
        response.sendRedirect("page.jsp?error");
    }
    else {
        StudentDAO stdDAO = new StudentDAOlmp();
        int id =parseInt(request.getParameter("id"));
        std= stdDAO.getById(id);
        if (std==null)
        {
            response.sendRedirect("page.jsp?error");
        }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Edit student</h1>\r\n");
      out.write("<form>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label>First Name</label>\r\n");
      out.write("        <input type=\"text\" name=\"first_name\" required=\"required\" class=\"form control\"\r\n");
      out.write("        placeholder=\"Enter First Name\" value=\"");
      out.print(std.getFirstName());
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
