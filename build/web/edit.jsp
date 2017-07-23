<%@ page import="listpac.Student" %>
<%@ page import="dao.StudentDAO" %>
<%@ page import="impl.StudentDAOlmp" %>
<%@ page import="static java.lang.Integer.*" %><%--
  Created by IntelliJ IDEA.
  User: bishal
  Date: 7/21/2017
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
  <%@ page import="listpac.Student" %>
<%@ page import="dao.StudentDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="impl.StudentDAOlmp" %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<head>
    <title></title>
    <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/html">
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="assets/js/jquery.min.js" type="text/javascript"> </script>
    <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<%
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
%>

<h1>Edit student</h1>
<form>
    <div class="form-group">
        <label>First Name</label>
        <input type="text" name="first_name" required="required" class="form control"
        placeholder="Enter First Name" value="<%=std.getFirstName()%>"/>

    </div>


</form>
</body>
</html>
