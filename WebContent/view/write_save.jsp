<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    
	String uploadPath = "c:\\upload";
	int size = 5*1024*1024;
	String encType= "utf-8";
	
	MultipartRequest multi = new MultipartRequest(request, uploadPath, size, encType, new DefaultFileRenamePolicy());

	String subject = multi.getParameter("subject");
	
    
%>