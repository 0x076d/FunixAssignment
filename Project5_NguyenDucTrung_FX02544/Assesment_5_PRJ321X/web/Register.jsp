
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body style="background-color:#f5f5f5">
         <jsp:include page="Header.jsp"/>
        <div class="container">
            <div class="jumbotron">
                <h1>Email Application</h1> 
            </div>
            <div class="row">
                <div class="col-md-6" style="margin:0 auto;background:white;padding:30px">
                    <h2>Register New Account</h2>
                    <form action="register" method='post'>
                        <input type='hidden' name='action' value='register'/>
                        <div class="form-group">
                            <label for="username">Username: </label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter username" autocomplete="off">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password">
                        </div>
                        
                        <input type="submit" value="Register" class="btn btn-success"/>
                        <label>
                            <a href="login" class="btn btn-link">Login</a>
                        </label>                       
                    </form>
                    <br/>
                    <p style='color:red'>${requestScope.message}</p>
                </div>
            </div>
        </div>
    </body>
</html>
