//: com.yulikexuan.thymeleaflab.controllers.CheckoutController.java


package com.yulikexuan.thymeleaflab.controllers;


import com.yulikexuan.thymeleaflab.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
public class CheckoutController {

	@RequestMapping("/checkout")
	public String getCheckoutForm() {
		return "checkoutform";
	}

	@RequestMapping(value = "/docheckout", method = RequestMethod.POST)
	public String doCheckout(@Valid CheckoutCommand checkoutCommand,
	                         BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "checkoutform";
		}

		return "checkoutcomplete";
	}

}///:~