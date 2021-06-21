
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
    <input type="hidden" value="${hostel.id}" name="id" />
    <label>Имя</label><br>
    <input name="name" value="${hostel.name}" /><br><br>
    <label>Фамилия</label><br>
    <input name="surname" value="${hostel.surname}" /><br><br>
    <label>Группа</label><br>
    <input name="groupa" value="${hostel.groupa}" /><br><br>
    <label>Номер общежития</label><br>
    <input name="number" value="${hostel.number}" type="number" min="1" /><br><br>
    <label>Номер комнаты</label><br>
    <input name="number_room" value="${hostel.number_room}" type="number" min="1" /><br><br>
    <input type="submit" value="Send" />
</form>
</body>
</html>
