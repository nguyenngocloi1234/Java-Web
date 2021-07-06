<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 6/19/2019
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Calculator</h1>

    <form action="calculate" method="post">
        <input type="number" name="firstOperand" placeholder="firstOperand" value="${firstOperand}">
        <input type="number" name="secondOperand" placeholder="secondOperand" value="${secondOperand}"><br/><br/>
        <input type="submit" name="operator" value="+">
        <input type="submit" name="operator" value="-">
        <input type="submit" name="operator" value="*">
        <input type="submit" name="operator" value="/">
        <h3 style="color:red">${message}</h3
        <h2> Result: ${result} </h2>
    </form>



</body>
</html>
