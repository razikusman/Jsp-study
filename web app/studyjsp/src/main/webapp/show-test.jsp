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
        <title>Test </title>
    </head>
    <body >
        <h1 align="center"><u>Student Marks in Exams</u></h1>
        <table border="1" cellpadding="5px" align="center" bordercolor="red">
            
            <tr>
                <th>Test ID</th>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Test Marks</th>
            </tr>
            <c:forEach var="items" items="${Testitems}">
                <tr>
                    <td>${items.test_id}</td>
                    <td>${items.student_id}</td>
                    <td>${items.student_name}</td>
                    <td>${items.test_marks}</td>
                </tr>
            
             </c:forEach>
        </table>
        
    </body>
</html>
