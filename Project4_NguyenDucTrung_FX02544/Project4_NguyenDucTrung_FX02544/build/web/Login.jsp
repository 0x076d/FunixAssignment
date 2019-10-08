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
        <title>Login</title>
    </head>
    <body style="background-color:#f5f5f5">
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <h1>Individual</h1> 
            </div>
            <div class="row">
                <div class="col-md-6" style="margin:0 auto;background:white;padding:30px">
                    <h2>Login</h2>
                    <form action="login" method='post'>
                        <input type='hidden' name='action' value='login'/>
                        <div class="form-group">
                            <label for="username">Username: </label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter username" autocomplete="off" required="">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password" required="">
                        </div>
                        <input type="submit" value="Login" class="btn btn-success"/>
                        <br/>
                        <label>
                            Don't have account?<a href="register" class="btn btn-link">Register</a>
                        </label>                       
                    </form>
                    <br/>
                    <p style='color:red'>${requestScope.message}</p>
                </div>
            </div>
        </div>
    </body>
</html>
