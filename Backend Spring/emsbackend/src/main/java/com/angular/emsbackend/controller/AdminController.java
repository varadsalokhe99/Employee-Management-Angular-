package com.angular.emsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.emsbackend.entity.AdminLogin;
import com.angular.emsbackend.service.AdminService;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@PostMapping("/login/admin")
	public boolean login(@RequestBody AdminLogin adminLogin) {
		
		AdminLogin login = adminService.login(adminLogin.getUserName(), adminLogin.getPassword());
		
		if(login != null) {
			return true;
		}
		else {
//			throw new RuntimeException("Invalid UserName and Password");
			return false;
		}
		
	}
}
