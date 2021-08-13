<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="/css/register.css">
</head>
<body>
    <header class="bg-dark">
        <div class="container">
            <h1 align="center">Добро пожаловать!!!</h1>
        </div>
    </header>
    <div class="registr-box">
        <h2 align="center">Регистрация</h2>
        <form action="${pageContext.request.contextPath}/registr", method="post">
            <div align="center" class="text-boxes">
                <label class="label" for="fullName">Ваше ФИО</label>
                <input type="text" id="fullName" placeholder="ФИО" name="fullName"/>
            </div>
            <div align="center" class="date-boxes">
                <label for="date" class="label">Дата рождения</label>
                <input type="date" id="date" name="date"/>
            </div>
            <div align="center" class="text-boxes">
                  <label class="label" for="login" style="float: top">Login*</label>
                  <input type="text" id="login" placeholder="login" name="login"/>
            </div>
            <div align="center" class="text-boxes">
                  <label class="label" for="password">Password*</label>
                  <input type="password" id = "password" placeholder="password" name="password"/>
            </div>
            <div align="center" class="text-boxes">
                  <label class="label" for="email">E-mail*</label>
                  <input type="email" id = "email" placeholder="example@...com" name="email"/>
            </div>
             <div align="center">
                  <input class="submit" type="submit" name="submit" value="sign up">
             </div>
        </form>
    </div>
</body>
</html>
