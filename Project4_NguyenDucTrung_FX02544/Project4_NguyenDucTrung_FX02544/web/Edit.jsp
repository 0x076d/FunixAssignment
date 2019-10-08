<%-- 
    Document   : login
    Created on : Aug 21, 2019, 8:35:52 PM
    Author     : DucTrung
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit article</title>
    </head>
    <body style="background:#f6f6f6">
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <br/>
            <div class="row">
                <div class="col-md-6" style="margin:0 auto;background:white;padding:30px;border-radius:10px">
                    <form action="edit" method="post">
                        <input type="hidden" name="id" value="${requestScope.id}"/>
                        <h1>Edit an article</h1>
                        <div class="form-group">
                            <label for="title">Title:</label>
                            <input type="text" class="form-control" id="title" name="title" required="" value="${requestScope.a.title}">
                        </div>
                        <div class="form-group">
                            <label for="content">Content:</label>
                            <textarea rows="8" type="text" class="form-control" id="content" name="content" required="">${requestScope.a.content}</textarea>
                        </div>
                        <div class="form-group">
                            <label for="postTime">Post Time:</label>
                            <input type="text" class="form-control" id="postTime" name="postTime" readonly="" value="${requestScope.a.postTime}">
                        </div>
                        <button type="submit" class="btn btn-info">Edit</button>
                        <a href="author" class="btn btn-link">Back To Home</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
