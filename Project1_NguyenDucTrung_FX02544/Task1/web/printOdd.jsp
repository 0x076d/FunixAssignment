<%-- 
    Document   : printOdd
    Created on : Aug 12, 2019, 4:22:59 PM
    Author     : DucTrung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Print Odd Number </h1> 
        <!--From 1 to 500 (Odd divisible by 5 : RED BOLD )-->
        <%
            for (int i = 1; i < 500; i++) {
                if (i % 2 != 0) {
                    if (i % 5 == 0) {

        %>
        <p>
            <b style="color: red">
                <%=i%>
            </b> 
        </p>
        <%
        } else {
        %>
        <p>
            <%=i%>
        </p>

        <%
                    }
                }
            }
        %>
    </body>
</html>
