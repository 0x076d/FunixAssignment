<%-- 
    Document   : displayInformation
    Created on : Aug 12, 2019, 5:17:15 PM
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
        <h1>Display Information!</h1>
        <%
            String name = (String) request.getAttribute("name");
            String surname = (String) request.getAttribute("surname");
            String phone = (String) request.getAttribute("phone");
            String email = (String) request.getAttribute("email");
            String[] courses = (String[]) request.getAttribute("courses");

        %>
        <p>Name: <%=name%></p>
        <p>Surname: <%=surname%> </p>
        <p>Phone Number: <%=phone%></p>
        <p>Email Address: <%=email%></p>
        <p>
            Which courses you want to choose?
            <br/>
            <%
               for (int i = 0; i < courses.length; i++) {

            %>
        <p>*<%=courses[i]%> </p>
            <%
                }
            %>
        </p>
    </body>
</html>
