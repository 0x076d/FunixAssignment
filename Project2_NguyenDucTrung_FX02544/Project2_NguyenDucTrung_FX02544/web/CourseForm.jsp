<%-- 
    Document   : CourseForm
    Created on : Aug 16, 2019, 10:11:19 PM
    Author     : DucTrung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Student Information</title>

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
                <h1>Person Form</h1>                
                <%
                    String getError1 = (String) request.getAttribute("error1");
                    String getError2 = (String) request.getAttribute("error2");
                    String getError3 = (String) request.getAttribute("error3");
                    String getError4 = (String) request.getAttribute("error4");
                    if (getError1 != null) {
                %>
                <div class="alert alert-danger alert-dismissible fade in">
                    <%=getError1%>
                </div>
                <%
                } else if (getError2 != null) {
                %>
                <div class="alert alert-danger alert-dismissible fade in">
                    <%=getError2%>
                </div>
                <%
                } else if (getError3 != null) {
                %>
                <div class="alert alert-danger alert-dismissible fade in">
                    <%=getError3%>
                </div>
                <%
                } else if(getError4 != null) {
                %>
                <div class="alert alert-danger alert-dismissible fade in">
                    <%=getError4%>
                </div>
                <%
                    }
                %>
                <form action="CourseValidationServlet" method="GET">
                    <div class="row">
                        <div class="col-sm-3">
                            <label>Full Name</label>
                            <input type="text" class="form-control" name="fullname" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-1">
                            <label>Age</label>
                            <input type="text" class="form-control" name="age">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-2">
                            <label>Country</label>
                            <select name="country" class="form-control">
                                <option value="Vietnam" selected>Vietnam</option>
                                <option value="US">US</option>
                                <option value="UK">UK</option>
                                <option value="China">China</option>
                                <option value="France">France</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-5">
                            <label>Courses</label>
                            <select name="course" class="form-control" multiple>
                                <option value="C#">C#</option>
                                <option value="Java">Java</option>
                                <option value="C++">C++</option>
                                <option value="Python">Python</option>
                                <option value="Ruby on Rail">Ruby on Rail</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3">
                            <label>Choose language during studying:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-1">
                            <div class="checkbox">
                                <label><input type="checkbox" name="lang" value="Vietnamese"> Vietnamese</label>
                            </div>
                        </div>
                        <div class="col-sm-1">
                            <div class="checkbox">
                                <label><input type="checkbox" name="lang" value="English"> English</label>
                            </div>
                        </div>
                        <div class="col-sm-1">
                            <div class="checkbox">
                                <label><input type="checkbox" name="lang" value="French"> French</label>
                            </div>
                        </div>
                        
                        <div class="col-sm-1">
                            <div class="checkbox">
                                <label><input type="checkbox" name="lang" value="American"> American</label>
                            </div>
                        </div>
                        
                        <div class="col-sm-1">
                            <div class="checkbox">
                                <label><input type="checkbox" name="lang" value="Chinese"> Chinese</label>
                            </div>
                        </div>
                        
                    </div>
                    <br>
                    <input type="submit" class="btn btn-primary" name="submit" value="Submit">
                    <input type="submit" class="btn btn-primary" name="cancel" value="Cancel">
                </form>
            </div>
        </div>
    </body>
</html>