package site.metacoding.mvc.domain;

// �����ͺ��̽��� ���̺��� �ڹ� ���� �𵨸�
public class MyUser {
	private int id;
	private String username;
	private String password;
	private String email;

	// �⺻ ������
	public MyUser() {

	}

	// Ǯ������
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
