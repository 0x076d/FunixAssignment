<%-- 
    Document   : subjectRegistration
    Created on : Aug 12, 2019, 4:59:26 PM
    Author     : DucTrung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Subject Registration</h1>

        <form action="Registration" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Name</td>
                        <td>
                            <input type="text" name="name" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td>
                            <input type="text" name="surname" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td>
                            <input type="text" name="phone" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Email Address</td>
                        <td>
                            <input type="text" name="email" value="" style="color: red" width="300px" />
                        </td>
                    </tr>
                    <tr>
                        <td>Courses:</td>
                        <td>
                            <input type="checkbox" name="courses" value="Python" />Python 
                            <br>
                            <input type="checkbox" name="courses" value="Networking" />Networking 
                            <br>
                            <input type="checkbox" name="courses" value="Linux" />Linux 
                        </td>
                    </tr>
                </tbody>

            </table>
            <input type="submit" name="submit" value="Submit" />

        </form>
    </body>
</html>
