
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>Welcome</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6" style="margin:0 auto">
                    <h3>${requestScope.message}</h3>
                    <a href="loginProcess" class="btn btn-link">Login</a>
                    <a href="signup" class="btn btn-link">Register</a>
                </div>
            </div>
        </div>
    </body>
</html>
