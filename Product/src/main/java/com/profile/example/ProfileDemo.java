package com.profile.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProfileDemo {
	@Value("${message}")
	private String message;
	
	@Value("${prodspecificationkey}")
	private String prodSpecificationKey;
	
	public String getProdSpecificationKey() {
		return prodSpecificationKey;
	}

	public void setProdSpecificationKey(String prodSpecificationKey) {
		this.prodSpecificationKey = prodSpecificationKey;
	}

	@PostConstruct
	public void getMessage() {
		System.out.println("Message is" +message);
	}
}
