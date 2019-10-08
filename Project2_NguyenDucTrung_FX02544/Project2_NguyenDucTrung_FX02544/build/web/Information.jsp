<%-- 
    Document   : Information
    Created on : Aug 16, 2019, 10:14:43 PM
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
                <h1>Information</h1>                
                <%
                    String getFullName = (String) request.getAttribute("getFullName");
                    String getAge = (String) request.getAttribute("getAge");
                    String getCountry = (String) request.getAttribute("getCountry");
                    String[] getCourse = (String[]) request.getAttribute("getCourse");
                    String[] getLanguage = (String[]) request.getAttribute("getLanguage");
                %>
                <p>Full Name: <%=getFullName%></p>
                <p>Age: <%=getAge%></p>
                <p>Country: <%=getCountry%></p>
                <p>
                    Course chosen:
                    <%
                        for (int i = 0; i < getCourse.length; i++) {
                    %>
                    <%=getCourse[i] + ", "%>
                    <%
                        }
                    %>
                </p>
                <p>
                    Language to study:
                    <%
                        for (int i = 0; i < getLanguage.length; i++) {
                    %>
                    <%=getLanguage[i] + ", "%>
                    <%
                        }
                    %>
                </p>


<!--<p>Language to study: <%=getLanguage%></p>-->
            </div>
        </div>
    </body>
</html>
