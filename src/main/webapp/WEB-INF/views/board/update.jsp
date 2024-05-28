<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<form method="post">
	<p><input name="title" placeholder="제목" value="${row.title }"></p>
	<p><input name="nick" placeholder="작성자" value="${row.nick }"></p>
	<p><input name="userid" placeholder="아이디" value="${row.userid }"></p>
	<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
	


<button>수정</button>

</form>
</body>
</html>