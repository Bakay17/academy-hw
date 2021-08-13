<%@ page import = "org.example.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcom</title>
</head>
<body>
    <div align="center">
        <%User user = (User) request.getAttribute("user");%>
        <h2><%=user.toString()%></h2>
    </div>
</body>
</html>