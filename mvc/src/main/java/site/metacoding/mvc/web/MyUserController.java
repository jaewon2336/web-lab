package site.metacoding.mvc.web;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import site.metacoding.mvc.domain.MyUser;
import site.metacoding.mvc.domain.MyUserRepository;

// 회원 관련(myUser 테이블) 요청만 컨트롤함
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
		System.out.println("getAll 호출됨");

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
		System.out.println("getOne 호출됨");

		MyUser myUser = repo.selectById(id);
		// 여기 로그가 찍히는데 저기서 안찾아지면 request 사라진 것, 여기도 안찍히면 디비에 없는거
		System.out.println("myUser : " + myUser.getUsername());

		// 무슨타입으로 받을지 모르기때문에 오브젝트 타입으로 받고 있음 -> 실제로 사용할때는 다운캐스팅 해줘야 함
		request.setAttribute("myUser", myUser); // 키, 밸류
		try {
			// response.sendRedirect("/userInfo.jsp"); // 저장장치가 Redirect 수행
			RequestDispatcher dis = request.getRequestDispatcher("/userInfo.jsp");
			dis.forward(request, response);
		} catch (Exception e) {
			// userInfo.jsp가 없을수도 있으니까
			e.printStackTrace();
		}
	}
}