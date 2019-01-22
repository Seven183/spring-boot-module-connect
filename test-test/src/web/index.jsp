<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: siguiqiang
  Date: 2018-8-22
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    <title>$Title$</title>
    </head>
    <body>
        <%--<form action="/testPathValiable/1" method="post">--%>
            <%--id: <input type="text" name="id"/><br>--%>
            <%--user:<input type="text" name="user"/><br>--%>
            <%--submit: <input type="submit" name="submit"/>--%>
        <%--</form>--%>

        <%--<hr>--%>
        <%--<a href="/myView"> testmyview !</a>--%>

        <%--<hr>--%>
        <%--<a href="/textpolo" >testpolo</a>--%>

        <%--<hr>--%>
        <%--<a href="/ll"> Welcome to SpringMVC ！</a>--%>

        <%--<hr>--%>
        <%--<form action="/textpolo" method="post">--%>
            <%--user:    <input type="text" name="user"/><br>--%>
            <%--password:<input type="text" name="password"/> <br>--%>
            <%--<input type="submit" name="submit"/>--%>
        <%--</form>--%>


        <%--获取employee--%>
        <form action="/emps" method="post">
            employee:<input type="text" name="employee"><br>
            submit:<input type="submit" name="submit"><br>
        </form>

<%--/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--%>

        <br><br>

        <a href="emps">List All Employees</a>
        <br><br>


    </body>
</html>
