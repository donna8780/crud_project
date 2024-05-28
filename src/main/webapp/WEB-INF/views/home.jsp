<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>


<table>
	<tr>
		<th>No</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>수정</th>
		<th>삭제</th>
	</tr>
	
	<c:forEach var= "row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.title }</td>
			<td>${row.nick }</td>
			<td>${row.w_date }</td>
			<td><a href="${cpath}/board/update?idx=${row.idx}">클릭</a></td>
			<td><a href="${cpath}/board/delete?idx=${row.idx}">클릭</a></td>
		</tr>
	
	 </c:forEach>


</table>
	
</body>
</html>