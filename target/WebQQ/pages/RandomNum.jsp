<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task B randomNumber</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin-top: 400px;
            background: #f69a73;
        }

        .decor {
            position: relative;
            max-width: 400px;
            margin: 50px auto 0;
            background: white;
            border-radius: 30px;
        }

        .form-left-decoration, .form-right-decoration {
            content: "";
            position: absolute;
            width: 50px;
            height: 20px;
            background: #f69a73;
            border-radius: 20px;
        }

        .form-left-decoration {
            bottom: 60px;
            left: -30px;
        }

        .form-right-decoration {
            top: 60px;
            right: -30px;
        }

        .form-left-decoration:before, .form-left-decoration:after, .form-right-decoration:before, .form-right-decoration:after {
            content: "";
            position: absolute;
            width: 50px;
            height: 20px;
            border-radius: 30px;
            background: white;
        }

        .form-left-decoration:before {
            top: -20px;
        }

        .form-left-decoration:after {
            top: 20px;
            left: 10px;
        }

        .form-right-decoration:before {
            top: -20px;
            right: 0;
        }

        .form-right-decoration:after {
            top: 20px;
            right: 10px;
        }

        .circle {
            position: absolute;
            bottom: 80px;
            left: -55px;
            width: 20px;
            height: 20px;
            border-radius: 50%;
            background: white;
        }

        .form-inner {
            padding: 50px;
        }

        .form-inner input, .form-inner textarea {
            display: block;
            width: 100%;
            padding: 0 20px;
            margin-bottom: 10px;
            background: #E9EFF6;
            line-height: 40px;
            border-width: 0;
            border-radius: 20px;
            font-family: 'Roboto', sans-serif;
        }

        .form-inner input[type="submit"] {
            margin-top: 30px;
            background: #f69a73;
            border-bottom: 4px solid #d87d56;
            color: white;
            font-size: 14px;
        }

        .form-inner textarea {
            resize: none;
        }

        .form-inner h3 {
            margin-top: 0;
            font-family: 'Roboto', sans-serif;
            font-weight: 500;
            font-size: 24px;
            color: #707981;
        }

        #mid {
            padding-left: 875px;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/randomSum" method="get">
    <form class="decor">
        <div class="form-left-decoration"></div>
        <div class="form-right-decoration"></div>
        <div class="circle"></div>
        <div class="form-inner">
            <center>

                <label> <input type="text" value="${randomObj.getNumberOne()}" id="mid"> </label>
                <label> <input type="text" value="${randomObj.getNumberTwo()}" id="mid"> </label>
                <input type="submit" value="${randomObj.getNumberOne() + randomObj.getNumberTwo()}">
            </center>
        </div>
    </form>
</form>
</body>
</html>
