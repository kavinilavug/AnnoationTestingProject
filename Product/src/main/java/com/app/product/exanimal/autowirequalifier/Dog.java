package com.app.product.exanimal.autowirequalifier;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public String charateristics() {
		// TODO Auto-generated method stub
		return "Bark";
	}

}
