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
    <title>Общежитие</title>

</head>
<body>
<header id="header" class="header">

    <div class = "obvod">
        <h3><a href='<c:url value="/glav.jsp" />' >На главную</a></h3>
        <h2 class="sss">Таблица Общежитий</h2>
        <h3><a href='<c:url value="/createObch" />' class="sandwich">Добавить данные</a></h3>

    </div>


</header>

<table border="4" class="obch">

    <tr><th>Номер общежития</th><th>Адресс</th></tr>
    <c:forEach var="hos" items="${obch}">

        <tr>
            <td>${hos.number1}</td>
            <td>${hos.address}</td>
            <td>
                <a href='<c:url value="/editObch?id=${hos.id}" />'>Edit</a>
                <form method="post" action='<c:url value="/deleteObch" />' style="display:inline;">
                    <input type="hidden" name="id" value="${hos.id}">
                    <input type="submit" value="Delete">
                </form>


            </td></tr>

    </c:forEach>
</table>
</body>
</html>