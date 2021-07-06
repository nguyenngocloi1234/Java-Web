<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 9/29/2019
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;

    %>

    <label>RATE: <%=rate%></label><br>
    <label>USD: <%=usd%></label><br>
    <label>VND: <%=vnd%></label>

</body>
</html>
