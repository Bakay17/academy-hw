<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Authorization</title>
    <link rel="stylesheet" href="css/login.css">>
</head>
<body>
<form action="${pageContext.request.contextPath}/authorization" method="post" class="login">
    <p>
        <label for="login">Логин:</label>
        <input type="text" name="login" id="login" value="login">
    </p>
    <p>
        <label for="password">Пароль:</label>
        <input type="password" name="password" id="password" value="12344">
    </p>
    <p class="login">
        <button type="submit" class="login-button">Войти</button>
    </p>

    <p class="password-href"><a href="index.html">Забыл пароль?</a></p>
</form>
</body>
</html>
