//: com.yulikexuan.thymeleaflab.services.ProductService.java


package com.yulikexuan.thymeleaflab.services;


import com.yulikexuan.thymeleaflab.domain.Product;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.*;


@Service
public class ProductService implements IProductService {

	private Map<Long, Product> productMap = new HashMap<>();

	@Override
	public Product getProduct(Long id) {
		return this.productMap.getOrDefault(id, new Product());
	}

	@Override
	public List<Product> listProducts() {
		return Collections.unmodifiableList(
				new ArrayList<>(this.productMap.values()));
	}

	@Override
	public int getProductCount() {
		return this.productMap.size();
	}

	@Override
	public void addProduct(Product product) {
		this.productMap.put(product.getId(), product);
	}

}///:~