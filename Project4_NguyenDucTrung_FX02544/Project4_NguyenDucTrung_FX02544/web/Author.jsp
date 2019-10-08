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
        <title>Author</title>
    </head>
    <body style="background:#f5f5f5">
        <jsp:include page="Header.jsp"/>
        <div class='container'>
            <br/>
            <div class='row'>
                <div style='margin:0 auto;background:white;padding:30px' class='col-md-8'>
                    <div class="card">
                        <div class="card-header">
                            <h1>Add new article</h1>
                        </div>
                        <div class="card-body">
                            <form action="author" method="post">
                                <div class="form-group">
                                    <label for="text">Title</label>
                                    <input type="text" class="form-control" id="title" name="title" placeholder="Post Title" required="">
                                </div>
                                <div class="form-group">
                                    <label for="content">Content:</label>
                                    <textarea rows="10" type="text" class="form-control" id="content" name="content" required=""></textarea>
                                </div>                              
                                <button type="submit" class="btn btn-danger">Post</button>
                            </form>
                        </div> 
                        <div class="card-footer"><p style="color:red">${requestScope.message}</p></div>
                    </div>
                </div>
                    <div class="col-md-4" style="background: white">
                    <table class="table table-bordered">
                        <thead class="thead-dark">
                            <tr>
                                <th style="text-align:center">Edit your Articles</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.list}" var="x">
                                <tr>
                                    <td>
                                        <a class="btn btn-link" href="edit?id=${x.id}">${x.title}</a>
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
