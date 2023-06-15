package com.pizza.autowirequalifier;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{

	@Override
	public String getPizza() {
		System.out.println("VegPizza");
		return "VegPizza";
	}

}
