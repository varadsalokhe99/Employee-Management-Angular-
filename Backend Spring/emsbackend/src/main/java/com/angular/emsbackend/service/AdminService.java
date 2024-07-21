package com.angular.emsbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.emsbackend.dao.AdminDao;
import com.angular.emsbackend.entity.AdminLogin;

@Service
public class AdminService {
	
	
	@Autowired
	private AdminDao adminDao;
	
	
	public AdminLogin login(String userName, String password) {
		
		AdminLogin adminLogin = adminDao.findByUserName(userName);
		
		if(adminLogin != null && adminLogin.getPassword().equals(password)) {
			return adminLogin;
		}
		else {
			return null; 
		}
	}
}
