<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>QuizA</h1>
	<ul>
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/board/writer">writer</a></li>
	</ul>
	<hr>
</body>
</html>