package com.domain;

import com.domain.model.Product;

public class App {
	public static void main(String[] args) {
		Product product=new Product(); 
		product.setProductId(100L);
		product.setDescription("The Power of Now!");
		
		System.out.println(product.getProductId());
		System.out.println(product.getDescription());
	}

}
