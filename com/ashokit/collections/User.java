package com.ashokit.collections;

public class User {

	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals Method........");
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		User user = (User) obj;
		return this.username.equals(user.username) && this.password.equals(user.getPassword());
	}

	@Override
	public int hashCode() {
		System.out.println("HashCode Method.....");
		int result = username.hashCode();
		result = 31 * result + password.hashCode();
		return result;
	}
}
