<%-- 
    Document   : home
    Created on : May 26, 2021, 9:18:50 PM
    Author     : Thanh Hoai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>NGuyễn thanh hoài</h1>

        <table>
            <tr>
                <th>id</th>
                <th>ten</th>
            </tr>

            <c:forEach items = "${list}" var="sv">
                <tr>
                    <td>${sv.id}</td>
                    <td>${sv.name}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
