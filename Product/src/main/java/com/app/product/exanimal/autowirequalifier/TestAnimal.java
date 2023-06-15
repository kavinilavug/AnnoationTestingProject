package com.app.product.exanimal.autowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestAnimal {
	//@Qualifier("dog")
	//@Autowired
	private Animal animal;
	@Autowired
	public TestAnimal(/*@Qualifier("dog")*/ Animal animal) {
		super();
		this.animal = animal;
	}

	public String callCharateristics() {
		return animal.charateristics();
	}
}
