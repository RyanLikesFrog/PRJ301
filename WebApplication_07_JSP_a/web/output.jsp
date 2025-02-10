<%-- 
    Document   : output
    Created on : Feb 10, 2025, 8:49:53 AM
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
        <%
            int n = (int) request.getAttribute("n");
        %>
        <h1>BANG CUU CHUONG: <%=n%> </h1>
        <%
            for(int i = 0; i < 11; i++){
                %>
                <a><%=n%> * <%=i%> = <%=n*i%> </a> <br>
        <%
            }
        %>
    </body>
</html>
