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
	<!-- <script type="text/javascript">
		alert('로그인을 해주세요.');
		location.href='login.do';
	</script> -->
</c:if>
<h3>글 쓰기</h3>
<hr>
<form name="frm1" method="post" action="save.do" enctype="multipart/form-data">
											<!-- ㄴ 파일 자체를 전송하기 위해 사용 -->
<!-- <form action="upload.jsp" method="post" enctype="multipart/form-data"> -->
	
<table>
	
	<tr>
		<td><input type="file" name="file" size="50"></td>
	</tr>
	
	<tr>
		<td><select name="Category" id="category">
			<option>주방/가전</option>
			<option>IT/전자</option>
			<option>패션/의류</option>
			<option>세면/욕실</option>
			<option>기타</option>
		</select> </td>
	</tr>
	
	<tr>
		<td><input type="text" name="subject" size="58" placeholder="제목" required></td>
	</tr>
	
	<tr>

		<td><textarea rows="20" cols="60" name="content" placeholder="작성하실 내용을 입력해주세요." required ></textarea></td>
	</tr>
	
	<tr><td>
	<tr><td colspan="2" align="center">
	<input type="submit" value="등록" class="btn">
	<input type="reset" value="초기화" class="btn">
	</td></tr>
	
</table>
</form> 
<!-- </form> -->
</section>
</body>
</html>