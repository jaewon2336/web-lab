<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="/user/login.html">로그인 페이지</a></li>
		<li><a href="/user/join.html">회원가입 페이지</a></li>
		<li><a href="/user/userInfo.jsp">회원정보 페이지</a></li>
		<li><a href="/post/list.html">글 목록 페이지</a></li>
	</ul>
	
	<%
	// request.getReader(); // BufferedReader, 문자열로 받아옴
	// request는 BufferedReader로 읽는 모든 정보를 자바 오브젝트로 바꾼 결정체(톰켓이 해줌)
	// http://localhost/user/userInfo.jsp?name=황재민
	// getParameter() 쿼리스트링 파싱해주는 메서드!!
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	
	// DB연결 -> SELECT
	// String name = "황재민";
	// String phone = "01029292929";
	
	// 1. 테이블 생성
	// 2. 쿼리스트링 파싱
	// 3. DB 연결
	// 4. SELECT로 id, name, phone 받기
	// 5. 뿌려주기
	%>
	<h1>회원정보 페이지입니다. - 인증 필요</h1>
	<h3>아이디 :</h3>
	<hr />
</body>
</html>