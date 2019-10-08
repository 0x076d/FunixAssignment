<%-- 
    Document   : login
    Created on : Aug 16, 2019, 8:35:52 PM
    Author     : DucTrung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Dynamic Website</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div> <br><br><br>

        <div class="container">
            <div class="starter-template">
                <h1>Login Form</h1>

                <%
                    String getError = (String) request.getAttribute("error");
                    if (getError != null) {

                %>
                <div class ="alert-danger alert-dismissable fade in">
                    <%=getError%>
                </div>

                <%
                    }
                %>

                <form action="ControllerServlet" method="POST">
                    <div class="row">
                        <div class ="col-sm-3">
                            Username: <input type="text" name="user" class="form-control" />
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-3">
                            Password: <input type="password" class="form-control" name="pass">
                        </div>
                    </div>
                    <br/>

                    <div class="row">
                        <div class="col-sm-3">
                            <input type="submit" class="btn btn-info" value="Login">
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </body>
</html>
