<%--
  Created by IntelliJ IDEA.
  User: Os
  Date: 6/12/2019
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Convert Usd to Vnd</title>
  </head>
  <body>
    <h1>Converting....</h1>
    <form method="post" action="/convert">
      <table>
        <tr>
          <td>Rate:</td>
          <td><input type="number" name="rate" value="${rate}" placeholder="Enter a rate"></td>
        </tr>
        <tr>
          <td>USD:</td>
          <td><input type="number" name="usd" id="usd" value="${usd}" placeholder="Enter a number of usds"></td>
          <td>VND:</td>
          <td>${vnd}</td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Convert"></td>
        </tr>
      </table>
    </form>
  </body>
</html>
