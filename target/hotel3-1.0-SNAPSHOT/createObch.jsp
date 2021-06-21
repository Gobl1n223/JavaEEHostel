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
<h3 class="createtitl">Новое общежитие</h3>
<form method="post" class="create" >
    <label>Номер общежития</label><br>
    <input name="number1"/><br><br>
    <label>Адрес</label><br>
    <input name="address"/><br><br>


    <input type="submit" value="Save" />

</form>
</div>
</body>
</html>