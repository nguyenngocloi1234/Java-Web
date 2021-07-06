<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 5/31/2019
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/display_discount" method="post" >
  <label>Product Description: </label><br/>
  <input type="text" name="product_description" placeholder="PRODUCT"/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="list_price" placeholder="PRICE"/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="discount_percent" placeholder="DISCOUNT%"/><br/>

  <input type = "submit" id = "submit" value = "Calculator Discount"/>
</form>
</body>
</html>
