//: com.yulikexuan.thymeleaflab.controllers.ProductController.java


package com.yulikexuan.thymeleaflab.controllers;


import com.yulikexuan.thymeleaflab.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {

	private final IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/product")
	public String getProduct() {
		return "redirect:/index";
	}

	@RequestMapping("/product/{id}")
	public String getProductById(@PathVariable Long id, Model model) {
		model.addAttribute(this.productService.getProduct(id));
		return "product";
	}

}///:~