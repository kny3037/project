<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
<ul id="main">
	<li>
		<ul class="row">
			<li>번호</li>
			<li>글 제목</li>
		</ul>
	</li>
	<c:set var="pno" value="${pageDto.currentPage}"/>
	<c:forEach var="vo" items="${list}">
	<li>
	<ul>
		<li>${vo.idx}</li>
		<li><a href="detail.do?idx=${vo.idx}&page=${pno}" class="title">${vo.subject }</a>
	</ul>
	</li>
	</c:forEach>
</ul>
<div style="margin:auto;">
	<a class="button" href="write.do">글쓰기</a>
</div>

<div>
<hr>
	<c:if test="${pageDto.startPage !=1 }">
		<a class="pagenum" href="?page=1">&lt;&lt;</a>
		<a class="pagenum" href="?page=${pageDto.startPage-1}">&lt;</a>  
	</c:if>
	
	<c:forEach var="i" begin="${pageDto.startPage }" end="${pageDto.endPage }">
		<a class="pagenum  
			<c:if test="${pageDto.currentPage == i }">current</c:if>
		" href="?page=${i}">${i}</a>
	</c:forEach>
	
	<c:if test="${pageDto.endPage !=pageDto.totalPage }">
		<a class="pagenum" href="?page=${pageDto.endPage+1}">&gt;</a>
		<a class="pagenum" href="?page=${pageDto.totalPage }">&gt;&gt;</a> <!-- 마지막페이지 --> 
	</c:if>
</div>
</body>
</html>