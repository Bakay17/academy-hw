<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task A</title>
    <meta charset="UTF-8">
    <style>
        .box {
            text-align: center;
            background-color: #eeeeee;
        }

        .centered {
            display: inline-block;
            margin: 0;
        }

        .chess-board {
            border-spacing: 0;
            border-collapse: collapse;
        }

        .chess-board th {
            padding: .5em;
        }

        .chess-board td {
            border: 1px solid;
            width: 5em;
            height: 5em;
            text-align: center;
            vertical-align: middle;
        }

        .chess-board .white {
            background: #f0d9b5;
        }

        .chess-board .black {
            background: #b58863;
        }
    </style>
</head>
<body>
<div class="box">
    <div class="centered">
        <table class="chess-board">
            <tbody>
            <tr>
                <th>a</th>
                <th>b</th>
                <th>c</th>
                <th>d</th>
                <th>e</th>
                <th>f</th>
                <th>g</th>
                <th>h</th>
            </tr>
            <jsp:useBean id="list" scope="request" type="java.util.List"/>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td class=${item.getClassName()[0]}>${item.getNumber()[0]}</td>
                    <td class=${item.getClassName()[1]}>${item.getNumber()[1]}</td>
                    <td class=${item.getClassName()[2]}>${item.getNumber()[2]}</td>
                    <td class=${item.getClassName()[3]}>${item.getNumber()[3]}</td>
                    <td class=${item.getClassName()[4]}>${item.getNumber()[4]}</td>
                    <td class=${item.getClassName()[5]}>${item.getNumber()[5]}</td>
                    <td class=${item.getClassName()[6]}>${item.getNumber()[6]}</td>
                    <td class=${item.getClassName()[7]}>${item.getNumber()[7]}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>