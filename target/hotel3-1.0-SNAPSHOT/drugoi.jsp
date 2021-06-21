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
    <title>Администрирование</title>

</head>
<body >
<header id="header" class="header">

    <div class = "obvod">
        <h3><a href='<c:url value="/glav2.jsp" />' >На главную</a></h3>
        <h2 class="sss">Таблица пользователе</h2>
        <h3><a href='<c:url value="/createLogin" />' class="sandwich">Добавить пользователя</a></h3>

    </div>


</header>

<table border="3" class="login">

    <tr><th>Имя</th><th>Пароль</th></tr>
    <c:forEach var="hos" items="${login}">

        <tr>
            <td>${hos.username}</td>
            <td>${hos.password}</td>
            <td>
                <form method="post" action='<c:url value="/deleteLogin" />' style="display:inline;">
                    <input type="hidden" name="id" value="${hos.id}">
                    <input type="submit" value="Delete">
                </form>


            </td></tr>

    </c:forEach>
</table>
</body>
</html>