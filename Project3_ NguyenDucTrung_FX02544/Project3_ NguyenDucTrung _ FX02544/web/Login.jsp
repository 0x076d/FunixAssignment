

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <br/>
            <div class="row">
                <div class="col-md-6" style="margin:0 auto;background:#f5f5f5">
                    <h3>Login</h3>
                    <form action="loginProcess" method="POST">
                        <div class="form-group">
                            <label for="username">Username:</label>
                            <input type="text" class="form-control" id="username" name="username">
                        </div>
                        <div class="form-group">
                            <label for="password">Password:</label>
                            <input type="password" class="form-control" id="password" name="password">
                        </div>                       
                        <button type="submit" class="btn btn-primary">Login</button>
                        <a href="signup" class="btn btn-link">Sign-up</a>
                    </form>
                    <p style="color:red;">${requestScope.message}</p>
                    <br/>
                </div>
            </div>
        </div>
    </body>
</html>
