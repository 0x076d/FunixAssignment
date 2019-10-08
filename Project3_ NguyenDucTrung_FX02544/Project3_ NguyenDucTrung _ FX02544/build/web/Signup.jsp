<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>Sign-up</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="row">
                <div class="col-md-6" style="margin:0 auto;background:#f5f5f5">
                    <h3>Register</h3>
                    <form action="signup" method="POST">
                        <div class="form-group">
                            <label for="username">Username:</label>
                            <input type="text" class="form-control" id="username" name="username" required value="${requestScope.username}">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" id="pwd" name="password" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                        <a href="loginProcess" class="btn btn-link">Sign-in</a>
                    </form>
                    <p style="color:red;font-weight:bold">${requestScope.message}</p>
                </div>
            </div>
        </div>
    </body>
</html>
