<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        <%@include file="WEB-INF/stil.css"%>
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Студенты</title>

</head>
<body >
<header id="header" class="header">

    <div class = "obvod">
        <h3><a href='<c:url value="/glav.jsp" />' >На главную</a></h3>
        <h2 class="sss">Таблица студентов</h2>
        <h3><a href='<c:url value="/create" />' class="sandwich">Добавить студента</a></h3>

    </div>


</header>

<table border="8">

    <tr><th>Имя</th><th>Фамилия</th><th>Группа</th><th>Обжещитие</th><th>Комната</th></tr>
    <c:forEach var="hos" items="${hostel}">

        <tr>
            <td>${hos.name}"</td>
            <td>${hos.surname}</td>
            <td>${hos.groupa}</td>
            <td>${hos.number}</td>
            <td>${hos.number_room}</td>
            <td>
            </td></tr>

    </c:forEach>
</table>
</body>

