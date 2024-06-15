package com.ashokit.model;

public class SignUp {
	
	private String fullName;
	
	private String userEmail;
	
	private String contactNo;
	
	private String courses;
	
	public SignUp(String fullName, String userEmail, String contactNo, String courses) {
		this.fullName = fullName;
		this.userEmail = userEmail;
		this.contactNo = contactNo;
		this.courses = courses;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "SignUp [fullName=" + fullName + ", userEmail=" + userEmail + ", contactNo=" + contactNo + ", courses="
				+ courses + "]";
	}
}
