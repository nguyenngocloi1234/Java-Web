<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 10/5/2019
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Customer list</title>
</head>
<body>
    <h1>Customers</h1>
    <p><a href="/customers?action=create">Create new customer</a></p>
    <form>
        <label>Find customer by name: </label>
        <input type="text" name="searchName" id="searchName" placeholder="Enter a name">
        <input type="submit" value="Search" >
    </form>

    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delelte</th>
        </tr>

        <c:forEach items="${requestScope['customers']}" var="customer">
            <tr>
                <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
                <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
            </tr>

        </c:forEach>
    </table>

</body>
</html>
