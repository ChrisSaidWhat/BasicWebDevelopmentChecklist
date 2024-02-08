<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Total Completion 🫡</title>
<link href="styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="flex-container">
	<div class="topContainer">
	<h1>${correspondingMessage.toString()}</h1>
	<img src="totalCompletion.jpg" class="redirectImg">
	</div>
	<div class="bottomContainer">
	<a href="input.jsp">⇤ Return To Checklist ⇤</a>
	</div>
</div>
</body>
</html>