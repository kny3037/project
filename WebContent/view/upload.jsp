<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String filename="";   //업로드되는 파일이름
		int sizeLimit = 15*1024*1024;  //최대 파일 크기
		
		String realPath = request.getServletContext().getRealPath("upload");
		//실제로 서버에 저장되는 path를 upload로 
		
		/* File dir = new File(realPath);
		if(!dir.exists()) dir.mkdirs(); */
		
		MultipartRequest multipartRequest = null;
		multipartRequest = new MultipartRequest
				(request, realPath, sizeLimit,"utf-8");
		//파일 업로드 처리
		
		filename = multipartRequest.getFilesystemName("photo");
		//photo라는 이름으로 전송하고 업로드된 파일 이름 가져옴
	%>

	업로드한 파일의 경로 : ${pageContext.request.contextPath}/upload/<%=filename %>

</body>
</html>