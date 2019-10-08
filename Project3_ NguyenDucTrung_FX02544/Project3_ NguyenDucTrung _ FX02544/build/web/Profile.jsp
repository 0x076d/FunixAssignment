
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
    <center>
        <h1>User Profile:</h1>
        <h3>User name: ${sessionScope.login.username}</h3>
        <h3>Password: ${sessionScope.login.password}</h3>
    </center>
</body>
</html>
