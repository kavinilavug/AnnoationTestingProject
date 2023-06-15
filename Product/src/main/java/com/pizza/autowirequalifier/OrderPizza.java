package com.pizza.autowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderPizza {
	@Autowired(required = true)
	private Pizza vegPizza;

	public Pizza getPizza() {
		return vegPizza;
	}

	//@Autowired(required = true)
	public void setPizza(/*@Qualifier("vegPizza")*/ Pizza pizza) {
		this.vegPizza = pizza;
	}

	public String getOrderedPizza() {
		return vegPizza.getPizza();
	}
}
