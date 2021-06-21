
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        <%@include file="WEB-INF/stil.css"%>
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добавить студента</title>
</head>
<body>
<div class="divcreate">
<h3 class="createtitl">Новый студент </h3>
<form method="post" class="create">
    <label>Имя</label><br>
    <input name="name"/><br><br>
    <label>Фамилия</label><br>
    <input name="surname"/><br><br>
    <label>Группа</label><br>
    <input name="groupa"/><br><br>
    <label>Номер общежития</label><br>
    <input name="number"/><br><br>
    <label>Номер комнаты</label><br>
    <input name="number_room"/><br><br>

    <input type="submit" value="Save" />

</form>
</div>
</body>
</html>
