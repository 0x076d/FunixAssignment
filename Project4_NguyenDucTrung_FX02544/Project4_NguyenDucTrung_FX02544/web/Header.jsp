<%-- 
    Document   : login
    Created on : Aug 21, 2019, 8:35:52 PM
    Author     : DucTrung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <a class="navbar-brand" href="#">Individual</a>
            <ul class="navbar-nav">  
                <c:choose>
                    <c:when test='${sessionScope.login == null}'>
                        <li class="nav-item">
                            <a class="nav-link" href="login">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="register">Register</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                         <li class="nav-item">
                             <a class="nav-link" href="#">Welcome: ${sessionScope.login}</a>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link" href="logout">Logout</a>
                        </li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </nav>
    </body>
</html>
