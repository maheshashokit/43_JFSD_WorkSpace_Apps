
public class User {
	
	private String username;
	
	private String password;
	
	private String emailId;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String displayUserDetails() {
		return String.format("Username %s and Password %s and EmailId %s", username,password,emailId);
	}
}
