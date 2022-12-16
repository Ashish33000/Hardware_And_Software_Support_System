package com.project.model;

public class Engineer {
	private int eid;
	private String name;
	private String address;
	private String email;
	private String password;
	private String category;

	public Engineer() {
		// TODO Auto-generated constructor stub
	}

	public Engineer(int eid, String name, String address, String email, String password, String category) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Engineer [eid=" + eid + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + ", category=" + category + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
