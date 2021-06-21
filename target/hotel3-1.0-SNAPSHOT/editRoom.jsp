
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
    <input type="hidden" value="${room.id}" name="id" />
    <label>Номер комнаты</label><br>
    <input name="number_room" value="${room.number_room}" type="number_room" min="1" /><br><br>
    <label>Этаж</label><br>
    <input name="floor" value="${room.floor}" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
