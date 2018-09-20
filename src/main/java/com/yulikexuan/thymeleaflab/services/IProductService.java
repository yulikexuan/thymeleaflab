//: com.yulikexuan.thymeleaflab.services.IProductService.java


package com.yulikexuan.thymeleaflab.services;


import com.yulikexuan.thymeleaflab.domain.Product;

import java.util.List;


public interface IProductService {

    Product getProduct(Long id);

    List<Product> getProducts();

    int getProductCount();

    void addProduct(Product product);

}///:~