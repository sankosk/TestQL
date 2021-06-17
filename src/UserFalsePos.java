public class UserFalsePos {

	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String email;
	private String password;
	
	public UserFalsePos (String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Non sensitive";
	}
	
}

