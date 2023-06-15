package com.app.product.exanimal.autowirequalifier;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class test {
public static void main(String args[]) {

List<String> categories=Arrays.asList("Java","Java","python","HTML","CSS");

categories.stream().forEach(System.out::print);

for(String Category:categories) {
	System.out.println(Category);
}

categories.stream().forEach(category->System.out.println(category));

}
}
