<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Редактировать</title>
</head>
<body>
<h3>Редактировать</h3>
<form method="post">
    <input type="hidden" value="${obch.id}" name="id" />
    <label>Номер общежития</label><br>
    <input name="number1" value="${obch.number1}" type="number1" min="1" /><br><br>
    <label>Адрес</label><br>
    <input name="address" value="${obch.address}" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
