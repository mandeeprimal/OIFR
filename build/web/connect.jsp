<%@ page import="data.Manager" %>
<%@ page import="java.sql.Connection" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title></title>
</head>
<body>
<%
    Manager db = new Manager();
    Connection conn =db.getConnection();
    if(conn==null)
    {
        out.print("connection failed ");
    }
    else
    {
        out.print("connection succeed");
    }

%>

</body>
</html>
