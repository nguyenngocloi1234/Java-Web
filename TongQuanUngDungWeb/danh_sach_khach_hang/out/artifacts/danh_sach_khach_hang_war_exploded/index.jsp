<%@ page import="java.util.List" %>
<%@ page import="model.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 6/3/2019
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <title>Show Customer</title>
</head>
<body>
    <% List<Customer> customers = new ArrayList<>();
    Customer customerOne = new Customer("David","1995-09-08","California","ảnh");
    customers.add(customerOne);
    customers.add(new Customer("loi","1993-10-26","qn","handsome"));
    customers.add(new Customer("Trang","1996-10-04","hv","cute"));
    request.setAttribute("customers", customers);
//        customers.add(new C)
    %>
    <h2>danh sach khach hang</h2>

    <table style="width:100%; text-align: center">
        <tr>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Avatar</th>
        </tr>
        <c:forEach items="${customers}" var="cus">
            <tr>
                <td>${cus.getName()}</td>
                <td>${cus.getBirthday()}</td>
                <td>${cus.getAddress()}</td>
                <td>${cus.getImage()}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
