<%@page import="org.apache.tomcat.dbcp.dbcp2.PStmtKey"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	// 1. 테이블 생성(끝)
	// 2. 쿼리스트링 파싱(끝)

	// 3. DB 연결(끝)

	int id = Integer.parseInt(request.getParameter("id"));
	// String name = null;
	// String phone = null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SCOTT", "TIGER");
		System.out.println("DB 연결 완료");

		// 4. SELECT로 id, name, phone 받기
		String sql = "SELECT * FROM userInfo WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);

		ResultSet rs = pstmt.executeQuery();
		rs.next();

		id = rs.getInt("id");
		String name = rs.getString("name");
		String phone = rs.getString("phone");
		
		// conn.close();

	} catch (Exception e) {
		System.out.println("오류 : " + e.getMessage());
	}

	// 5. 뿌려주기
	%>

	<h1>회원정보 페이지입니다. - 인증 필요</h1>
	<h3>아이디 : <%=id%> / 이름 : <%=name %> / 전화번호 : <%=phone%></h3>
	<hr />
</body>
</html>