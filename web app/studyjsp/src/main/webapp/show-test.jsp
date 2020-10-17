<%-- 
    Document   : show-test
    Created on : Oct 16, 2020, 11:57:58 PM
    Author     : UsmanSPC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <c:forEach var="items" items="${TestItems}">
            
            ${items}
            
        </c:forEach>
    </body>
</html>
