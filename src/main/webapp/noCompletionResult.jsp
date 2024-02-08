<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>No Completion 🫤</title>
<link href="styles.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="topContainer">
	<h1>${correspondingMessage.toString()}</h1>
	<img src="noCompletion.jpg" class="redirectImg">
	</div>
	<div class="bottomContainer">
	<a href="input.jsp">⇤ Return To Checklist ⇤</a>
	</div>
</body>
</html>