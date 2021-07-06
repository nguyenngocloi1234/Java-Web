<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 9/29/2019
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        Map<String,String> dic = new HashMap<>();
    %>
    <%
        dic.put("hello","Xin chao");
        dic.put("how","the nao");
        dic.put("book","quyen vo");
        dic.put("computer","may tinh");

        String search = request.getParameter("search");
        String result = dic.get(search);

        if(result != null){
            out.println("Word: "+search);
            out.println("Result: "+result);
        } else {
            out.println("Not found");
        }
    %>

</body>
</html>
