<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-09-26
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save Product</title>
</head>
<body>
<div id="global">
    <h4>The Customer has been saved</h4>
    <p>
    <h5>Details:</h5>
    Customer Id: ${requestScope.customer.customerId};<br>
    Customer Name: ${requestScope.customer.customerName}
    </p>
</div>
</body>
</html>
