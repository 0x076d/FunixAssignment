<%-- 
    Document   : login
    Created on : Aug 21, 2019, 8:35:52 PM
    Author     : DucTrung
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reader Home</title>
    </head>
    <body style='background: #f5f5f5'>
        <jsp:include page="Header.jsp"/>
        <div class='container'>
            <br/>
            <div class='row'>
                <div style='margin:0 auto;background:white;padding:30px' class='col-md-12'>
                    <h1>List Articles</h1>
                    <table class="table table-bordered" style="text-align:center">
                        <thead class="thead-dark">
                            <tr>
                                <th>Title</th>
                                <th>Content</th>
                                <th>Post Time</th>
                                <th>Author</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.a}" var="a">
                                <tr>
                                    <td>
                                        <a href="read?id=${a.id}">${a.title}</a>
                                    </td>
                                    <td>
                                        <p>${a.contentSummary}</p>
                                    </td>
                                    <td>
                                        ${a.postTime}
                                    </td>
                                    <td>
                                        ${a.author}
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
