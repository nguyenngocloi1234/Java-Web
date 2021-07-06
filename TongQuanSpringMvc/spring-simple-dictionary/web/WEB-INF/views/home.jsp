<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 6/17/2019
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Simple Dictionary</h1>
    <h3 style="color:red">${message}</h3>

    <form action="translate" method="post">
        <input type="text" name="txtsearch" placeholder="${txtsearch}"><br>
        <input type="submit" value="Translate">
        <label>${result}</label>

    </form>
</body>
</html>

