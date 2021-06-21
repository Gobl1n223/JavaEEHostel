
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        <%@include file="WEB-INF/stil.css"%>
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добавить комнату</title>
</head>
<body>
<div class="divcreate">

<h3 class="createtitl">Новая комната</h3>
<form method="post" class="create">
    <label>Номер комнаты</label><br>
    <input name="room"/><br><br>
    <label>Этаж</label><br>
    <input name="floor"/><br><br>


    <input type="submit" value="Save" />
</form>
</div>
</body>
</html>