<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 01.06.2021
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <style>
        <%@include file="WEB-INF/stil.css"%>
    </style>   <title>Главная</title>
    <div class="glavna">
        <img src="https://vuzopedia.ru/storage/app/uploads/public/5a4/f7b/fec/5a4f7bfecd31d499721402.jpg" class="kartinka23">
    <a href='<c:url value="/IndexServlet" />'  ><h1 class="header_title1">Таблица студентов</h1></a>
    <a href='<c:url value="/ObchServlet" />'  ><h1 class="header_title2">Таблица общежитий</h1></a>
    <a href='<c:url value="/RoomServlet" />'  ><h1 class="header_title3">Таблица комнат</h1></a>

    </div>
</head>
<body>

</body>
</html>
