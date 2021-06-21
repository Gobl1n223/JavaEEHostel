<%-- 
    Document   : login
    Created on : 4 июн. 2021 г., 16:24:08
    Author     : break
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Авторизация</title>
        <script> 
function validate()
{ 
     var username = document.form.username.value; 
     var password = document.form.password.value;
 
     if (username==null || username=="")
     { 
     alert("Поле логин не должно быть пустым"); 
     return false; 
     }
     else if(password==null || password=="")
     { 
     alert("Поле пароль не должно быть пустым"); 
     return false; 
     } 
}
</script> 
    </head>
    <style><%@include file="/WEB-INF/stil.css"%></style>
    <body>
    <img src="https://vuzopedia.ru/storage/app/uploads/public/5a4/f7b/fec/5a4f7bfecd31d499721402.jpg" class="kartinka23">
        <h2>Авторизация </h2>
    <br>
    <div class="tablica">
    <form name="form" action="LogServ" method="post" onsubmit="return validate()">
        <!-- Do not use table to format fields. As a good practice use CSS -->
        <table align="center" >
         <tr>
         <td>Логин</td>
         <td><input type="text" name="userName" /></td>
         </tr>
         <tr>
         <td>Пароль</td>
         <td><input type="password" name="password"/></td>
         </tr>
         <tr> 
         <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Войти"></input>       
         </tr>
        </table>
    </form>
    </div>
    </body>
</html>
