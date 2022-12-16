package com.project.model;

public class Employee {
	private int eid;
	private String name;
	private String addess;
	private String email;
	private String password;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String name, String addess, String email, String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.addess = addess;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addess=" + addess + ", email=" + email + ", password="
				+ password + "]";
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
