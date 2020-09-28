<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/static/img/favicon.ico.png" />
    <title>Spring 5 MVC</title>
</head>
<body>
    <h1>Spring 5 MVC - Hello World Example</h1>

    <img src="${pageContext.request.contextPath}/static/img/welcome.png" />
    <p>
        <strong>Message :</strong> ${message} <br/>
        <strong>Date : </strong> ${date} <br/>
    </p>
</body>
</html>