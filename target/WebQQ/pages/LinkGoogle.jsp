<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task B goToGoogle</title>

    <style>
        body {
            background: #ebcacb;
            margin-top: 400px;
        }

        .closing-button {
            text-decoration: none;
            display: inline-block;
            margin: 10px;
            color: white;
            box-shadow: 0 0 0 2px white;
            padding: 20px 0;
            width: 150px;
            text-align: center;
            text-transform: uppercase;
            letter-spacing: 3px;
            position: relative;
            overflow: hidden;
        }

        .closing-button span {
            font-family: 'Montserrat', sans-serif;
            position: relative;
            z-index: 5;
        }

        .closing-button:before, .closing-button:after {
            content: "";
            position: absolute;
            top: 0;
            bottom: 0;
            right: 0;
            left: 0;
        }

        .closing-button:before {
            transform: translateX(-100%);
            background: white;
            transition: transform .3s cubic-bezier(.55, .055, .675, .19);
        }

        .closing-button:after {
            background: #413ad5;
            transform: translateX(100%);
            transition: transform .3s cubic-bezier(.16, .73, .58, .62) .3s;
        }

        .closing-button:hover:before, .closing-button:hover:after {
            transform: translateX(0);
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/goToGoogle" method="get">
    <center><a href="${link.toString()}" class="closing-button"><span>Google</span></a></center>
</form>
</body>
</html>