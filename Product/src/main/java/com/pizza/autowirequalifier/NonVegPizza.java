package com.pizza.autowirequalifier;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza {

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		System.out.println("NonVegPizza");
		return "nonvegPizza";
	}

}
