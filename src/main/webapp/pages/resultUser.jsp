<jsp:useBean id="result" scope="request"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Document</title>
</head>
<body>
<center>
    <h1>${result} <% request.getParameter("result"); %></h1>
</center>
</body>
</html>
