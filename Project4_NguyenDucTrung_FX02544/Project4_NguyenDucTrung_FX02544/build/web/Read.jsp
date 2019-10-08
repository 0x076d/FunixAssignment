<%-- 
    Document   : login
    Created on : Aug 21, 2019, 8:35:52 PM
    Author     : DucTrung
--%><%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Read Detail</title>
    </head>
    <body style="background:#f6f6f6">
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <br/>
            <div class="row">
                <div class="col-md-8" style="margin:0 auto;background:white">
                    <h1>${requestScope.a.title}</h1>
                    <div class="form-group">
                        <label for="content">Content:</label>
                        <textarea rows="30" type="text" class="form-control" id="content" name="content" readonly>${requestScope.a.content}</textarea>
                    </div>
                        <p>Post Time: <b>${requestScope.a.postTime}</b></p>
                        <p>Author:<i> ${requestScope.a.author}</i></p>
                </div>
            </div>
        </div>
    </body>
</html>
