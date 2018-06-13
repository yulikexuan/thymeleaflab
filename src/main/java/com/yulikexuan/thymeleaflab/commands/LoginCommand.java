//: com.yulikexuan.thymeleaflab.commands.LoginCommand.java


package com.yulikexuan.thymeleaflab.commands;


import lombok.Data;

import javax.validation.constraints.NotEmpty;


@Data
public class LoginCommand {

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

}///:~