package site.metacoding.servletproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http �������� ���� ���� (GET)
// http1.0 �������� (GET, POST)
// http1.1 �������� -> ���� �Ϲ������� ����ϴ� ����Ʈ �������� (GET(�ּҿ�û), POST(���±�), DELETE(�ڹٽ�ũ��Ʈ), PUT(�ڹٽ�ũ��Ʈ))

// http://localhost:80/front
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		// ��¥ �޸𸮿� �ѹ��� �ߴ��� ���� -> ��� uri ��û(����)�ص� �ϳ��� �޸𸮿� ���.
		System.out.println("�� �޸𸮿� ���� : FrontController");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �����ڵ�, �μ�Ʈ �ڵ� �� © �� ����. ��� �����ϱⰡ �����.
		System.out.println("front ��Ʈ�ѷ��� ��û ����");

		// ������� ó��!!

		// 1. ���� ��Ʈ������ �ּҸ� �б��Ű�� ����� �����
		String path = request.getParameter("path");
		System.out.println(path);

		if (path.equals("login")) {
			// �α����������� ����
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
			// ������������ ����
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
