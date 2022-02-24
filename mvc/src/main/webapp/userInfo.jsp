<%@page import="site.metacoding.mvc.domain.MyUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 페이지 입니다.</h1>
<hr/>
<%
	// import 하려면 무조건 자동완성으로 ㅜㅜ
	// 다운캐스팅 해줘야 함!!
	MyUser myUser = (MyUser) request.getAttribute("myUser");
%>
아이디 : <%=myUser.getId() %> <br/>
유저네임 : <%=myUser.getUsername() %> <br/>
패스워드 : <%=myUser.getPassword() %> <br/>
이메일 : <%=myUser.getEmail() %> <br/>
</body>
</html>