package com.angular.emsbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angular.emsbackend.entity.AdminLogin;

@Repository
public interface AdminDao extends JpaRepository<AdminLogin, Integer> {
	
	AdminLogin findByUserName(String userName);
	
}
