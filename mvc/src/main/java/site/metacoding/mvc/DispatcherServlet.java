package site.metacoding.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import site.metacoding.mvc.web.MyUserController;

// http://localhost:8000/
// http://localhost:8000/hello
// �������� ��������� �ڿ� �������� �������� ����

// http://localhost:8000/myuser�� ������ ���� ��Ʈ�ѷ��� ���� �Ľ� �������
// http://localhost:8000/mypost�� ������ ����Ʈ ��Ʈ�ѷ��� ���� �Ľ� �������

@WebServlet("/") // � ��û�� ���͵� �� ������ ����
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String domain = request.getRequestURI();

		System.out.println("domain : " + domain);

		if (domain.equals("/myuser")) {
			MyUserController controller = new MyUserController(request, response);

			// int id = Integer.parseInt(request.getParameter("id"));
			String idStr = request.getParameter("id"); // null

			if (idStr == null) {
				controller.getAll();
				System.out.println("���� ȣ������");
			} else {
				int id = Integer.parseInt(idStr);
				controller.getOne(id);
			}
		}
	} // Dispatcher ������ ���� (1. Ŭ���̾�Ʈ���� ����� response�� ���� -> stateless, 2. request �޸�
		// ���� ����, 3. DB Connection �ݳ�)

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	} // Dispatcher ������ ����

}
