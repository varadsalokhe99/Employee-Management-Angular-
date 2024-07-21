package com.angular.emsbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class AdminLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginId;
	
	private String userName;
	
	private String password;

	public AdminLogin() {
		
	}

	public AdminLogin(String userName, String password) {
		super();
		
		this.userName = userName;
		this.password = password;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

