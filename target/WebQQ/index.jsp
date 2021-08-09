<html>
<head>
    <title> Task 43 </title>

    <style>
        body {
            margin-top: 300px;
            background: url(https://html5book.ru/wp-content/uploads/2015/10/background54.png);
        }

        .animated-button {
            text-decoration: none;
            display: inline-block;
            margin: 10px 20px;
            padding: 15px 30px;
            overflow: hidden;
            border: 2px solid;
            border-bottom-width: 4px;
            font-family: 'Montserrat', sans-serif;
            text-transform: uppercase;
            font-weight: bold;
            letter-spacing: 2px;
            color: rgba(30, 255, 188, 1);
            background: rgba(255, 255, 255, 1);
            transition: color .3s, background .5s;
        }

        .animated-button:hover {
            animation: stripes .75s infinite linear;
            background: linear-gradient(45deg, rgba(30, 255, 188, 1) 25%, rgba(255, 255, 255, 1) 25%, rgba(255, 255, 255, 1) 50%, rgba(30, 255, 188, 1) 50%, rgba(30, 255, 188, 1) 75%, rgba(255, 255, 255, 1) 75%, rgba(255, 255, 255, 1));
            background-size: 10px 10px;
            color: #FF50E5;
        }

        @keyframes stripes {
            0% {
                background-position: 0 0;
            }
            100% {
                background-position: 50px 0;
            }
        }
    </style>
</head>

<body>
<center>
    <form action="${pageContext.request.contextPath}/primeNumber" method="get">
        <input type="submit" class="animated-button" value="Task A">
    </form>
    <form action="${pageContext.request.contextPath}/time" method="get">
        <input type="submit" class="animated-button" value="Task B time">
    </form>
    <form action="${pageContext.request.contextPath}/randomSum" method="get">
        <input type="submit" class="animated-button" value="Task B random">
    </form>
    <form action="${pageContext.request.contextPath}/goToGoogle" method="get">
        <input type="submit" class="animated-button" value="Task B google">
    </form>
</center>
</body>
</html>