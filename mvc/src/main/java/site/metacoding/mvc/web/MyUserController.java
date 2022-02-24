package site.metacoding.mvc.web;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import site.metacoding.mvc.domain.MyUser;
import site.metacoding.mvc.domain.MyUserRepository;

// ȸ�� ����(myUser ���̺�) ��û�� ��Ʈ����
public class MyUserController {

	private HttpServletRequest request;
	private HttpServletResponse response;
	private MyUserRepository repo;

	public MyUserController(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		repo = new MyUserRepository();
	}

	// GET:http://localhost:8000/myuser
	public void getAll() {
		System.out.println("getAll ȣ���");

		List<MyUser> myUserList = repo.selectAll();
		System.out.println("myUserList : " + myUserList);

		request.setAttribute("myUserList", myUserList);
		try {
			RequestDispatcher dis = request.getRequestDispatcher("/user.jsp");
			dis.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// GET:http://localhost:8000/myuser?id=1
	public void getOne(int id) {
		System.out.println("getOne ȣ���");

		MyUser myUser = repo.selectById(id);
		// ���� �αװ� �����µ� ���⼭ ��ã������ request ����� ��, ���⵵ �������� ��� ���°�
		System.out.println("myUser : " + myUser.getUsername());

		// ����Ÿ������ ������ �𸣱⶧���� ������Ʈ Ÿ������ �ް� ���� -> ������ ����Ҷ��� �ٿ�ĳ���� ����� ��
		request.setAttribute("myUser", myUser); // Ű, ���
		try {
			// response.sendRedirect("/userInfo.jsp"); // ������ġ�� Redirect ����
			RequestDispatcher dis = request.getRequestDispatcher("/userInfo.jsp");
			dis.forward(request, response);
		} catch (Exception e) {
			// userInfo.jsp�� �������� �����ϱ�
			e.printStackTrace();
		}
	}
}