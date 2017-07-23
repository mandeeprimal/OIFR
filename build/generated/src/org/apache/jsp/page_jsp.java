package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import impl.StudentDAOlmp;
import listpac.Student;
import dao.StudentDAO;
import java.sql.*;
import java.io.*;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link href=\"assets/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/html\">\r\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"> </script>\r\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1>STUDENTS FORMS</h1>\r\n");
      out.write("    <table  class=\"table table-bordered table-hover\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>Id</th>\r\n");
      out.write("            <th>FirstName</th>\r\n");
      out.write("            <th>LastName</th>\r\n");
      out.write("            <th>Faculty</th>\r\n");
      out.write("            <th>Semester</th>\r\n");
      out.write("            <th>Operation</th>\r\n");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("\r\n");

      try {
          /* Create string of connection url within specified format with machine name, port number and database name. Here machine name id localhost and database name is student. */
          String connectionURL = "jdbc:mysql://localhost:3306/ioe";

          // declare a connection by using Connection interface
          Connection connection = null;

          // declare object of Statement interface that is used for executing sql statements.
          Statement statement = null;

          // declare a resultset that uses as a table for output data from tha table.
          ResultSet rs = null;

          // Load JBBC driver "com.mysql.jdbc.Driver"
          Class.forName("com.mysql.jdbc.Driver").newInstance();

          /* Create a connection by using getConnection() method that takes parameters of string type connection url, user name and password to connect to database. */
          connection = DriverManager.getConnection(connectionURL, "root", "");

          /* createStatement() is used for create statement object that is used for sending sql statements
          to the specified database. */
          statement = connection.createStatement();

          // sql query to retrieve values from the secified table.
          String QueryString = "SELECT * from tbl_student";
          rs = statement.executeQuery(QueryString);

      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

    while (rs.next()) {
    
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("            <td>");
      out.print(rs.getInt(1));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("            <td>\r\n");
      out.write("    ");
   }    
      out.write("\r\n");
      out.write("    ");

    // close all the connections.
    rs.close();
    statement.close();
    connection.close();
} catch (Exception ex) {
    
      out.write("\r\n");
      out.write("        ");

                out.println("Unable to connect to database.");
            }
        
      out.write("\r\n");
      out.write("     <a href=\"edit.jsp?id=");
      out.print(s.getId());
      out.write("\" class=\"btn btn success btn xs\" >\r\n");
      out.write("                <span class=\"glyphicon glyphicon-pencil\" onclick=\"return confirm('Are you sure wanna edit?')\"> EDIT </span></a>\r\n");
      out.write("            <a href=\"edit.jsp?id=");
      out.print(s.getId());
      out.write("\" class=\"btn btn success btn xs\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-eye-open\"> VIEW </span></a>\r\n");
      out.write("                <a href=\"edit.jsp?id=");
      out.print(s.getId());
      out.write("\" class=\"btn btn success btn xs\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-trash\" onclick=\"return confirm('Are you sure to delete?')\"> DELETE </span></a>\r\n");
      out.write("                <a href=\"templete.jsp?id=");
      out.print(s.getId());
      out.write("\" class=\"btn btn success btn xs\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-circle-arrow-right\" onclick=\"return confirm('Do you wanna see in pdf format?')\"> PDF </span></a>\r\n");
      out.write("\r\n");
      out.write("            </td> </tr>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("    </table>\r\n");
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
