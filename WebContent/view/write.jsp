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

 <%-- <c:if test="${sessionScope.userId==null }">
	 <script type="text/javascript">
		alert('로그인을 해주세요.');
		location.href='login.do';
	</script>  
</c:if> --%> 

<h3>글 쓰기</h3>
<hr>
<form name="frm1" method="post" action="save.do" enctype="multipart/form-data" >
												<!-- action="write_save.jsp"  -->
<table>
	
	<tr>
		<td><select name="Category" id="category">
			<option value="주방/가전">주방/가전</option>
			<option value="IT/전자">IT/전자</option>
			<option value="패션/의류">패션/의류</option>
			<option value="세면/욕실">세면/욕실</option>
			<option value="기타">기타</option>
		</select> </td>
	</tr>
	
	<tr>
		<td><input type="file" name="fileName" size="50" accept="image/*" ></td>				
	</tr>
	
	<tr>
		<td><input type="text" name="subject" size="58" placeholder="제목" required></td>
	</tr>
	
	<tr>
 		<td><input type="text" name="name" size="58" readonly value="${sessionScope.userId}" placeholder="작성자"></td>
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
</section>
</body>
</html>