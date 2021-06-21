
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        <%@include file="WEB-INF/stil.css"%>
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Добавить пользователя</title>
</head>
<body>
<div class="divcreate">
<h3 class="createtitl">Новый пользователь</h3>
<form method="post" class="create" >
    <label>Имя</label><br>
    <input name="username"/><br><br>
    <label>Пароль</label><br>
    <input name="password"/><br><br>


    <input type="submit" value="Save" />

</form>
</div>
</body>
</html>
