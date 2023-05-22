package com.simpleconfigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	
	@Autowired
	Employee emp;
	
	public void getEmpConfig() {
	emp.employeeDetails();
	}
}
