
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script
            type="text/javascript" src="<%=request.getContextPath()%>/ckeditor/ckeditor.js">
        </script>
        <title>Home</title>
    </head>
    <body style='background: #f5f5f5'>
        <jsp:include page="Header.jsp"/>
        <div class='container'>
            <br/>
            <div class='row'>
                <div style='margin:0 auto;background:white;padding:30px' class='col-md-6'>
                    <h2>Send mail</h2>
                    <form action="home" method="post">
                        <div class="form-group">
                            <label for="email">To:</label>
                            <input type="email" class="form-control" id="email" name='email' required="" value="${requestScope.to}">
                        </div>
                        <div class="form-group">
                            <label for="cc">CC:</label>
                            <input type="text" class="form-control" id="cc" required="" name='cc'value='${requestScope.cc}'>
                        </div>
                        <div class="form-group">
                            <label for="subject">Subject:</label>
                            <input type="text" class="form-control" id="subject" name='subject' required="" value="${requestScope.subject}">
                        </div>
                        <div class="form-group">
                            <label for="content">Content:</label>
                            <textarea rows="8" type='text' class="form-control"  id="editor" name='content' required="">${requestScope.content}</textarea>
                        </div>
                        <input type='submit' value='Send' class='btn btn-danger'/>
                    </form>
                        
                        <script>
                            CKEDITOR.replace('editor');
                        </script>
                        
                    <br/>
                    <p style='color:green'>${requestScope.message}</p>
                </div>
            </div>
        </div>
    </body>
</html>
