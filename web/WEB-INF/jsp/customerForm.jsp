<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-09-26
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add Customer Form</title>
</head>
<body>
<div id="global">
    <%-- <c:if test="${requestScope.errors!=null}">
         <p id="errors">

             Error(s)!
         <ul>
         <c:forEach var="error" items="${requestScope.errors}">
             <li>${error}</li>
         </c:forEach>
     </ul>
         </p>
     </c:if>--%>
    <form action="save_customer" method="post">
        <fieldset>
            <legend>Add a Product</legend>
            <p>
                <label for="customerid">Customer Id:</label>
                <input type="text" id="customerid" name="id" tabindex="1">
            </p>
            <p>
                <label for="customername">Customer Name:</label>
                <input type="text" id="customername" name="name" tabindex="3">
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Customer">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>