<%-- 
    Document   : example02
    Created on : Feb 10, 2025, 8:01:08 AM
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
        <b style="color: purple">BẢNG CỬU CHƯƠNG</b>
        <%
            for (int i = 1; i <= 100; i++) {
        %>
        <h4 style="color: red">Bảng cửu chương <%=i%> :</h4>
        <table style="border: 1px solid black">
            <tr>
                <%
                    for (int j = 1; j <= 10; j++) {
                %>
                <td> <%=i%> x <%=j%> = <%=i * j%></td>
            </tr>
            <%
                }
            %>
        </table>
        <%
            }
        %>

    </body>
</html>
