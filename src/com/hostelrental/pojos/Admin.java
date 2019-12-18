package com.hostelrental.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

	private Integer usesrId;
	private String userName;
	private String password;
	
	public Admin() {
		System.out.println("In Admin Default Constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Integer getUsesrId() {
		return usesrId;
	}

	public void setUsesrId(Integer usesrId) {
		this.usesrId = usesrId;
	}

	@Column(name = "username", length = 20, unique = true)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [usesrId=" + usesrId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
