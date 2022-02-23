package site.metacoding.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:80/index.jsp (URL)
// http://localhost:80/test (URI �ĺ��� ��û) URI ����Ϸ��� ������̼� �ʿ�
@WebServlet("/test")
public class TestServlet extends HttpServlet { // ���

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	// /hello ��û�� ������
	// ����ڿ��� ���� http body, http header ������ HttpServletRequest req�� ���
	// �� ģ������ ����� �� ��ü HttpServletResponse resp�� ����
	// �ּ�â�� ���͸� ġ�� ����ġ/��Ĺ�� doGet(req, resp); ��Ƽ� �޼��� ȣ��
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get��û��");

		String name = "Jaewon";

		// printWriter���� \n, flush ���� ���ο� ����Ǿ� ����
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello EveryOne " + name + "</h1>");
		out.println("</body>");
		out.println("</html>");

		// ����
//		BufferedWriter writer = new BufferedWriter(
//				new OutputStreamWriter(resp.getOutputStream()));
//		writer.write("asdfas\n");
//		writer.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
