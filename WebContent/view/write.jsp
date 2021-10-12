<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<section>
<c:if test="${sessionScope.user==null }">
	<script type="text/javascript">
		alert('글쓰기는 로그인을 해야합니다.');
		location.href='login.do';
	</script>
</c:if>
<form name="frm1" method="post" action="write.do">
<table>
	<tr>
		<th>제목</th>
		<td><input type="text" name="subject" size="50" required></td>
	</tr>
	
	<tr>
		<th>작성자</th>
		<td>
		<input type="text" name="userId" size="50" readonly value="${sessionScope.user }">
		</td>
	</tr>
</table>




</form>
</section>
</body>
</html>