<%-- 
    Document   : DateTimeChecker
    Created on : May 29, 2023, 4:10:10 PM
    Author     : BaPhuoc
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Date Time Checker</title>
</head>
<body>
    <h1>Date Time Checker</h1>
    <form action="DateTimeCheckerServlet">
        Day: <input type="number" name="txtDay" value="" /><br/>
        Month: <input type="number" name="txtMonth" value="" /><br/>
        Year: <input type="number" name="txtYear" value="" /><br/>
        <c:set var="x" value="${isValidDate}" />
        <c:if test="${x == true}">
          <p style="color: green;">Date is valid!</p>
        </c:if>
        <c:if test="${x == false}">
            <p style="color: red;">Date is invalid!</p>
        </c:if>  
        <input type="submit" value="Check" name="btAction" />
    </form>
</body>
</html>

