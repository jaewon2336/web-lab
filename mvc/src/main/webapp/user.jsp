<%@page import="site.metacoding.mvc.domain.MyUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>전체 회원정보 페이지 입니다.</h1>
<hr/>
<%
List<MyUser> myUserList = (List<MyUser>) request.getAttribute("myUserList");

for(int i = 0; i < myUserList.size(); i++) { %>
아이디 : <%=myUserList.get(i).getId() %> <br/>
유저네임 : <%=myUserList.get(i).getUsername() %> <br/>
패스워드 : <%=myUserList.get(i).getPassword() %> <br/>
이메일 : <%=myUserList.get(i).getEmail() %> <br/>
<hr/>
<%} %>
</body>
</html>