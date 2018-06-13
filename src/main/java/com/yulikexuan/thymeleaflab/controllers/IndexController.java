//: com.yulikexuan.thymeleaflab.controllers.IndexController.java


package com.yulikexuan.thymeleaflab.controllers;


import com.yulikexuan.thymeleaflab.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	private final IProductService productService;

	@Autowired
	public IndexController(IProductService productService) {
		this.productService = productService;
	}

	@RequestMapping({"/", "/index"})
	public String getIndex(Model model) {

		model.addAttribute("products", this.productService.getProducts());
		return "index";
	}

}///:~