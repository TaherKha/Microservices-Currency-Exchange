package com.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	
	private long productId; 
	
	private String productName;
	
	private String description; 
	
	private float price; 
	
}
