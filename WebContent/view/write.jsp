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
<%-- <section>
<c:if test="${sessionScope.user==null }">
	<script type="text/javascript">
		alert('글쓰기는 로그인을 해야합니다.');
		location.href='login.do';
	</script>
</c:if> --%>
<form name="frm1" method="post" action="save.do">
<table>
	<tr>
		<th>제목</th>
		<td><input type="text" name="subject" size="50" required></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><input type="text" name="userId" size="50" readonly value="${sessionScope.user }"></td>	
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea rows="20" cols="60" name="content" required ></textarea></td>
	</tr>
	
	<tr><td>
	<tr><td colspan="2" align="center">
	<input type="submit" value="등록" class="btn">
	<input type="reset" value="초기화" class="btn">
	</td></tr>
	<form action="upload.jsp" method="post" enctype="multipart/form-data">   <!--  -->
												<!-- ㄴ 파일 자체를 전송하기 위해 사용 -->
	<input type="file" name="file" size="50">

</table>
</form>
</form>
</section>
</body>
</html>