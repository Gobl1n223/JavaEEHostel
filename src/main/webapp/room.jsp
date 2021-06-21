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
    <title>Комнаты</title>

</head>
<body>
<div>

<header id="header" class="header">

    <div class = "obvod">
        <h3><a href='<c:url value="/glav.jsp" />' >На главную</a></h3>
        <h2 class="sss">Таблица комнат</h2>
        <h3><a href='<c:url value="/createRoom" />' class="sandwich">Добавить данные</a></h3>

    </div>


</header>

<table border="8" class="room">

    <tr><th>Номер комнаты</th><th>Этаж</th></tr>
    <c:forEach var="hos" items="${room}">

        <tr>
            <td>${hos.number_room}</td>
            <td>${hos.floor}</td>
            <td>
                <a href='<c:url value="/editRoom?id=${hos.id}" />'>Edit</a>
                <form method="post" action='<c:url value="/deleteRoom" />' style="display:inline;">
                    <input type="hidden" name="id" value="${hos.id}">
                    <input type="submit" value="Delete">
                </form>


            </td></tr>

    </c:forEach>
</table>
</div>
</body>
</html>
