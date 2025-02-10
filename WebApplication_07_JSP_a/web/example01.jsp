<%-- 
    Document   : example01
    Created on : Feb 10, 2025, 7:38:02 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int a = 1000000000;%>
        <%
            double b;
            b = Math.sqrt(a);
        %>
        Kết quả: sqrt(<%=a%>) = <span style="color: #cc00ff"> <%=b%> </span> 
    </body>
</html>
