//: com.yulikexuan.thymeleaflab.domain.Product.java


package com.yulikexuan.thymeleaflab.domain;


import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
public class Product {

	private Long id;
	private String courseName;
	private String courseSubtitle;
	private String courseDescription;
	private Author author;
	private BigDecimal price;
	private List<ProductCategory> productCategories = new ArrayList<>();
	private String imageUrl;

}///:~