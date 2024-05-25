package com.ashokit.collections;

public class Employee1{
	
	private Integer empId;
	
	private String empName;
	
	private String location;
	
	private String job;
	
	private int age;

	public Employee1() {
	}
	
	public Employee1(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee1(Integer empId, String empName,String location) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
	}
	
	public Employee1(Integer empId, String empName,String location,String job, int age) {
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.job= job;
		this.age=age;
	}
	
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}