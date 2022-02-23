package site.metacoding.servletproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http 프로토콜 최초 버전 (GET)
// http1.0 프로토콜 (GET, POST)
// http1.1 프로토콜 -> 지금 일반적으로 사용하는 디폴트 프로토콜 (GET(주소요청), POST(폼태그), DELETE(자바스크립트), PUT(자바스크립트))

// http://localhost:80/front
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		// 진짜 메모리에 한번만 뜨는지 검증 -> 계속 uri 요청(엔터)해도 하나만 메모리에 뜬다.
		System.out.println("나 메모리에 떴어 : FrontController");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 삭제코드, 인서트 코드 다 짤 수 있음. 대신 협업하기가 힘들다.
		System.out.println("front 컨트롤러로 요청 들어옴");

		// 공통로직 처리!!

		// 1. 쿼리 스트링으로 주소를 분기시키는 라우터 만들기
		String path = request.getParameter("path");
		System.out.println(path);

		if (path.equals("login")) {
			// 로그인페이지를 응답
			response.sendRedirect("/login.jsp");
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>LoginPage</h1>");
//			out.println("</body>");
//			out.println("</html>");

		} else if (path.equals("join")) {
			// 조인페이지를 응답
			response.sendRedirect("/join.jsp");
//			PrintWriter out = response.getWriter();
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("</head>");
//			out.println("<body>");
//			out.println("<h1>JoinPage</h1>");
//			out.println("</body>");
//			out.println("</html>");
		}
	}
}
