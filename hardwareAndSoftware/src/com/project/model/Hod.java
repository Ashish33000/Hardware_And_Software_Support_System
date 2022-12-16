package com.project.model;

public class Hod {
	private int hid;
	private String name;
	private String address;
	private String email;
	private String password;
	public Hod() {
		// TODO Auto-generated constructor stub
	}
	public Hod(int hid, String name, String address, String email, String password) {
		super();
		this.hid = hid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	@Override
	
	
	public String toString() {
		return "Hod [hid=" + hid + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + "]";
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
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
	
	

}
