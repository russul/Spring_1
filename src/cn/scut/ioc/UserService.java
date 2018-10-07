package cn.scut.ioc;

public class UserService {
	private String username;
	private String password;
	
	public UserService() {

	}

	public UserService(String username) {
		this.username = username;
	}

	public void show() {
		System.out.println("hello:" + username + ":" + password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
