<%-- 
    Document   : Fibonacci
    Created on : Aug 12, 2019, 4:45:54 PM
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
        <h1>Fibonacci Sequence</h1>
        <%!
            public int Fibonacci(int n) {
                if (n < 2) {
                    return n;
                } else {
                    return Fibonacci(n - 1) + Fibonacci(n - 2);
                }
            }
        %>
        <%
            int i = 0;
            while (true) {
                if (Fibonacci(i) < 10946) {

        %>
        <p style="color: RED">
            <b> <%=Fibonacci(i)%> </b>
        </p>
        <%
                    i++;
                } else {
                    break;

                }
            }
        %>
    </body>
</html>
