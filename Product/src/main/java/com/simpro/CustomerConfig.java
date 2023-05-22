package com.simpro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.simpleconfigration.EmployeeConfig;

@Configuration
@Import(value = { EmployeeConfig.class })
public class CustomerConfig {
	@Bean(name = "customer")
	public Customer customer() {
		return new Customer("kavi", 101);
	}
}
