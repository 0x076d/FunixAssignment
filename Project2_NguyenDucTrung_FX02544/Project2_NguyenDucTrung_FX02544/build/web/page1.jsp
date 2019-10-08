<%-- 
    Document   : page1
    Created on : Aug 16, 2019, 8:35:41 PM
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
                <hr>
                <div class="alert alert-danger alert-dismissible fade in">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                   You must be filled out!!
                </div>
                <div class="row">
                    <div class="col-sm-2">
                        <b>Title</b>
                        <input type="text" class="form-control" placeholder="">
                    </div>
                    <div class="col-sm-5">
                        <b>First Name</b>
                        <input type="text" class="form-control" placeholder="Duc Trung">
                    </div>
                    <div class="col-sm-5">
                        <b>Last Name</b>
                        <input type="text" class="form-control" placeholder="Nguyen">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-6">
                        <b>Gender</b>
                        <select class="form-control">
                            <option></option>
                        </select>
                    </div>
                    <div class="col-sm-6">
                        <b>Date of Birth</b>
                        <input type="text" class="form-control" placeholder="dd/mm/yyyy">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-12">
                        <b>Address</b>
                        <input type="text" class="form-control" placeholder="Street">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-6">
                        <input type="text" class="form-control" placeholder="City">
                    </div>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" placeholder="State">
                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-sm-6">
                        <input type="text" class="form-control" placeholder="Post Code">
                    </div>
                    <div class="col-sm-6">
                        <select class="form-control">
                            <option>Country</option>
                        </select>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
