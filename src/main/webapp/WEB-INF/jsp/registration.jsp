<%@ page contentType="text/html; charset=utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
    <title>Страница регистрации</title>
    <link rel="stylesheet" href="" type="text/css">
</head>
<body>
        <div class="forma">
        ${message}
            <form action="/registration" method="post" id="registration-form">
                <input type="text" id="lgn" name="login" placeholder="Придумайте логин">
                <input type="password" id="psw" name="password" placeholder="Придумайте пароль">
                <input type="submit" value="Регистрация">
            </form>
        </div>
</body>
</html>