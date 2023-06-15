package com.app.product.exanimal.autowirequalifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {

	@Override
	public String charateristics() {
		// TODO Auto-generated method stub
		return "MEMOW";
	}

}
