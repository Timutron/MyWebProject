<%@ page contentType="text/html; charset=utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
    <title>Страница входа</title>
    <link rel="stylesheet" href="" type="text/css">
</head>
<body>
        <div class="forma">
            <form action="/login" method="post" id="login-form">
                <input type="text" id="lgn" name="login" placeholder="Введите логин">
                <input type="password" id="psw" name="password" placeholder="Введите пароль">
                <input type="submit" value="Вход">
            </form>
        </div>
</body>
</html>