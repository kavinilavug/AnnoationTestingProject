package com.simpleconfigration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean(name="employee")
	public Employee employee() {
		return new Employee("kavi",101);
	}
}
