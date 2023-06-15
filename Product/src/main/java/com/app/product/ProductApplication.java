package com.app.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.app.product.exanimal.autowirequalifier.TestAnimal;
import com.app.product.singleton.prototype.Prototype;
import com.app.product.singleton.prototype.Singleton;
import com.pizza.autowirequalifier.OrderPizza;
import com.simpleconfigration.AppConfig;
import com.simpleconfigration.Employee;
import com.simpro.Channel;
import com.simpro.Customer;
import com.simpro.CustomerConfig;

@EnableAutoConfiguration
@ComponentScan()//this will scan below the com.app.product backage -if you NOT USED Componentscan() or SpringBootapplicatoin annotation you should mention the package name 
@ComponentScan("com.simpro,com.pizza.autowirequalifier,com.simpleconfigration,com.profile.example")
@PropertySource(value = { "classpath:tutorial.properties" })//used to read the properties file
@EnableConfigurationProperties(value = { Channel.class }) // if you not use @component annotation in configuration
//@SpringBootApplication														// propertie class we should mention like this
public class ProductApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(ProductApplication.class, args);
		
		
		System.out.println("********");
		Channel ch = con.getBean(Channel.class);
		ch.getChannelName();
		System.out.println(ch.getChannelName());
		System.out.println(ch.getChannelid());
		System.out.println(ch.toString());

		System.out.println("********");
		Employee emp = con.getBean(Employee.class);
		emp.employeeDetails();
		AppConfig appConfig = con.getBean(AppConfig.class);
		appConfig.getEmpConfig();

		System.out.println("********");
    	TestAnimal ta=con.getBean(TestAnimal.class);
    	String animalSounds=ta.callCharateristics();
    	System.out.println("Animal SOund::"+animalSounds);
		System.out.println("********");
		
    	System.out.println("********");
		OrderPizza op = con.getBean(OrderPizza.class);
		String messag = op.getOrderedPizza();
		System.out.println(messag);
		
		Singleton s=con.getBean(Singleton.class);
		Singleton ss=con.getBean(Singleton.class);
		Singleton sss=con.getBean(Singleton.class);
		
		Prototype prototype=con.getBean(Prototype.class);
		Prototype prototype1=con.getBean(Prototype.class);
		Prototype prototype2=con.getBean(Prototype.class);
		
		
		System.out.println("********");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerConfig.class);
		Employee emp1 = ctx.getBean(Employee.class);
		emp1.employeeDetails();
		Customer cus = ctx.getBean(Customer.class);
		cus.customerDetails();
    	
		
	}
}
