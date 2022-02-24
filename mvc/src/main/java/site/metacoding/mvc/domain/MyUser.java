package site.metacoding.mvc.domain;

// 데이터베이스의 테이블을 자바 세상에 모델링
public class MyUser {
	private int id;
	private String username;
	private String password;
	private String email;

	// 기본 생성자
	public MyUser() {

	}

	// 풀생성자
	public MyUser(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	// id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// username
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
