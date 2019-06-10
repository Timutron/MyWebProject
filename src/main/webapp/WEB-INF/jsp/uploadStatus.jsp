<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<body>

<h1>Статус загрузки</h1>

<div th:if="${message}">
    <h2 th:text="${message}"/>
</div>

</body>
</html>