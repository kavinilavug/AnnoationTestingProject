package com.app.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.simpleconfigration.Employee;
import com.simpro.Channel;
import com.simpro.Customer;
import com.simpro.CustomerConfig;


@EnableAutoConfiguration
@ComponentScan("com.simpro,com.simpleconfigration")
@PropertySource(value = { "classpath:tutorial.properties" })
@EnableConfigurationProperties(value = { Channel.class }) // if you not use @component annotation in configuration
															// propertie class we should mention like this
public class ProductApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(ProductApplication.class, args);
		Channel ch = con.getBean(Channel.class);
		ch.getChannelName();
		System.out.println(ch.getChannelName());
		System.out.println(ch.getChannelid());
		System.out.println(ch.toString());

		// Employee emp=con.getBean(Employee.class);
		// emp.employeeDetails();
		// AppConfig appConfig=con.getBean(AppConfig.class);
		// appConfig.getEmpConfig();
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerConfig.class);
		Employee emp = ctx.getBean(Employee.class);
		emp.employeeDetails();
		Customer cus = ctx.getBean(Customer.class);
		cus.customerDetails();

	}
}
