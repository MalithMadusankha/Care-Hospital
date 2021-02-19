package com.model;

public class Employee {
	private String cID;
	private String name;
	private String position;
	private String phone;
	private String nic;
	private String password;
	private String email;
	
	public Employee(String cID, String name,String position, String phone, String nic, String password, String email) {
 
		this.cID = cID;
		this.name = name;
		this.position = position;
		this.phone = phone;
		this.nic = nic;
		this.password = password;
		this.email = email;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getcID() {
		return cID;
	}

	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getNic() {
		return nic;
	}

	public String getPassword() {
		return password;
	}

	public void setcID(String cID) {
		this.cID = cID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
