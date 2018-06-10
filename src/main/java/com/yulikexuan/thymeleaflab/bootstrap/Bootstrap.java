//: guru.springfamework.bootstrap.Bootstrap.java


package com.yulikexuan.thymeleaflab.bootstrap;


import com.yulikexuan.thymeleaflab.domain.Author;
import com.yulikexuan.thymeleaflab.domain.Product;
import com.yulikexuan.thymeleaflab.domain.ProductCategory;
import com.yulikexuan.thymeleaflab.services.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


/*
 * CommandLineRunner interface used to indicate that a bean should run when it
 * is contained within a SpringApplication
 *
 * Multiple CommandLineRunner beans can be defined within the same application
 * context and can be ordered using the Ordered interface or @Order annotation
 *
 * Command Runner is a Spring Boot specific class of loading data and only going
 * to work with Spring Boot
 *
 * The run method of this class gets called on startup and any arguments that
 * have been passed into the JVM will also get picked up here
 */
@Component
@Slf4j
public class Bootstrap implements CommandLineRunner {

	private final IProductService productService;

	@Autowired
	public Bootstrap(IProductService productService) {
		this.productService = productService;
	}

	/*
	 * Load up some classed
	 */
	@Override
	public void run(String... args) {
		this.loadProducts();
	}

	private void loadProducts() {

		Author jt = new Author();
		jt.setFirstName("John");
		jt.setLastName("Thompson");
		jt.setId(1L);
		jt.setImage("instructor_jt.jpg");

		ProductCategory springIntroCat = new ProductCategory();
		springIntroCat.setId(1L);
		springIntroCat.setCategory("Spring Introduction");

		ProductCategory springCoreCat = new ProductCategory();
		springCoreCat.setId(2L);
		springCoreCat.setCategory("Spring Core");

		ProductCategory springBootCat = new ProductCategory();
		springBootCat.setId(3L);
		springBootCat.setCategory("Spring Boot");

		ProductCategory thymeleafCat = new ProductCategory();
		thymeleafCat.setId(4L);
		thymeleafCat.setCategory("Thymeleaf");

		ProductCategory geapCat = new ProductCategory();
		geapCat.setId(5L);
		geapCat.setCategory("G.E.A.P");

		Product springIntro = new Product();
		springIntro.setId(1L);
		springIntro.setCourseName("Introduction to Spring");
		springIntro.setCourseSubtitle("Start Learning Spring!");
		springIntro.setAuthor(jt);
		springIntro.setCourseDescription("Why would you want to learn about " +
				"the Spring Framework? Simple, Spring is the most widely " +
				"used framework in the enterprise today. Major companies all " +
				"over the world are hiring programmers who know the Spring " +
				"Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking the " +
				"course, you should already have a foundation with the Java " +
				"programming language. You don't need to be an expert in " +
				"Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. I'll " +
				"show you hot to use the Spring Initializer and Spring Boot " +
				"to jumpstart your Spring Framework project. Ideally, you can " +
				"follow along and create your own Spring project. I know it " +
				"can be frustrating to follow along in a course and run into " +
				"errors. So don't worry, I have the complete source code " +
				"examples in Git for you to checkout and use.");
		springIntro.setPrice(new BigDecimal("0"));
		springIntro.setImageUrl("SpringIntroThumb.png");
		springIntro.getProductCategories().add(springIntroCat);
		springIntro.getProductCategories().add(springBootCat);
		this.productService.addProduct(springIntro);


		Product springCoreUltimate = new Product();
		springCoreUltimate.setId(2L);
		springCoreUltimate.setCourseName("Spring Core Ultimate");
		springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
		springCoreUltimate.setAuthor(jt);
		springCoreUltimate.setCourseDescription("Why would you want to learn " +
				"about the Spring Framework? Simple, Spring is the most " +
				"widely used framework in the enterprise today. Major " +
				"companies all over the world are hiring programmers who " +
				"know the Spring Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking the " +
				"course, you should already have a foundation with the Java " +
				"programming language. You don't need to be an expert in " +
				"Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. I'll " +
				"show you hot to use the Spring Initializer and Spring Boot " +
				"to jumpstart your Spring Framework project. Ideally, you " +
				"can follow along and create your own Spring project. I know " +
				"it can be frustrating to follow along in a course and run " +
				"into errors. So don't worry, I have the complete source " +
				"code examples in Git for you to checkout and use.");
		springCoreUltimate.setPrice(new BigDecimal("199"));
		springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
		springCoreUltimate.getProductCategories().add(springCoreCat);
		springCoreUltimate.getProductCategories().add(springBootCat);
		this.productService.addProduct(springCoreUltimate);

		Product thymeleaf = new Product();
		thymeleaf.setId(3L);
		thymeleaf.setCourseName("Thymeleaf");
		thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
		thymeleaf.setAuthor(jt);
		thymeleaf.setCourseDescription("Why would you want to learn about " +
				"the Spring Framework? Simple, Spring is the most widely " +
				"used framework in the enterprise today. Major companies all " +
				"over the world are hiring programmers who know the Spring " +
				"Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking " +
				"the course, you should already have a foundation with the " +
				"Java programming language. You don't need to be an expert " +
				"in Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. " +
				"I'll show you hot to use the Spring Initializer and Spring " +
				"Boot to jumpstart your Spring Framework project. Ideally, " +
				"you can follow along and create your own Spring project. I " +
				"know it can be frustrating to follow along in a course and " +
				"run into errors. So don't worry, I have the complete source " +
				"code examples in Git for you to checkout and use.");
		thymeleaf.setPrice(new BigDecimal("199"));
		thymeleaf.setImageUrl("ThymeleafThumb.png");
		thymeleaf.getProductCategories().add(thymeleafCat);
		this.productService.addProduct(thymeleaf);

		Product springCore = new Product();
		springCore.setId(4L);
		springCore.setCourseName("Spring Core");
		springCore.setCourseSubtitle("Spring Core - mastering Spring!");
		springCore.setAuthor(jt);
		springCore.setCourseDescription("Why would you want to learn about " +
				"the Spring Framework? Simple, Spring is the most widely " +
				"used framework in the enterprise today. Major companies all " +
				"over the world are hiring programmers who know the Spring " +
				"Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking " +
				"the course, you should already have a foundation with the " +
				"Java programming language. You don't need to be an expert " +
				"in Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. I'll " +
				"show you hot to use the Spring Initializer and Spring Boot " +
				"to jumpstart your Spring Framework project. Ideally, you " +
				"can follow along and create your own Spring project. I " +
				"know it can be frustrating to follow along in a course and " +
				"run into errors. So don't worry, I have the complete " +
				"source code examples in Git for you to checkout and use.");
		springCore.setPrice(new BigDecimal("199"));
		springCore.setImageUrl("SpringCoreThumb.png");
		springCore.getProductCategories().add(springCoreCat);
		springCore.getProductCategories().add(springBootCat);
		this.productService.addProduct(springCore);

		Product springCoreAdv = new Product();
		springCoreAdv.setId(5L);
		springCoreAdv.setCourseName("Spring Core Advanced");
		springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
		springCoreAdv.setAuthor(jt);
		springCoreAdv.setCourseDescription("Why would you want to learn " +
				"about the Spring Framework? Simple, Spring is the most " +
				"widely used framework in the enterprise today. Major " +
				"companies all over the world are hiring programmers who " +
				"know the Spring Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking the " +
				"course, you should already have a foundation with the " +
				"Java programming language. You don't need to be an expert " +
				"in Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. " +
				"I'll show you hot to use the Spring Initializer and Spring " +
				"Boot to jumpstart your Spring Framework project. Ideally, " +
				"you can follow along and create your own Spring project. I " +
				"know it can be frustrating to follow along in a course and " +
				"run into errors. So don't worry, I have the complete source " +
				"code examples in Git for you to checkout and use.");
		springCoreAdv.setPrice(new BigDecimal("199"));
		springCoreAdv.setImageUrl("SpringCoreAdvanced.png");
		springCoreAdv.getProductCategories().add(springCoreCat);
		springCoreAdv.getProductCategories().add(springBootCat);
		this.productService.addProduct(springCoreAdv);

		Product springCoreDevOps = new Product();
		springCoreDevOps.setId(6L);
		springCoreDevOps.setCourseName("Spring Core Dev-Ops");
		springCoreDevOps.setCourseSubtitle("Deploying Spring in the " +
				"Enterprise and the cloud!");
		springCoreDevOps.setAuthor(jt);
		springCoreDevOps.setCourseDescription("Why would you want to learn " +
				"about the Spring Framework? Simple, Spring is the most " +
				"widely used framework in the enterprise today. Major " +
				"companies all over the world are hiring programmers who " +
				"know the Spring Framework.\n" +
				"\n" +
				"My Introduction Spring Framework Tutorial is designed to " +
				"give you an introduction to the Spring Framework. This " +
				"course is written for beginners. Ideally before taking the " +
				"course, you should already have a foundation with the Java " +
				"programming language. You don't need to be an expert in " +
				"Java, but you should the basics of Object Oriented " +
				"Programming with Java.\n" +
				"\n" +
				"You will learn what Dependency Injection is, and how Spring " +
				"uses Inversion of Control to leverage Dependency Injection. " +
				"Next in my course, I will walk you step by step through " +
				"building your very first Spring Framework application. I'll " +
				"show you hot to use the Spring Initializer and Spring Boot " +
				"to jumpstart your Spring Framework project. Ideally, you " +
				"can follow along and create your own Spring project. I know " +
				"it can be frustrating to follow along in a course and run " +
				"into errors. So don't worry, I have the complete source " +
				"code examples in Git for you to checkout and use.");
		springCoreDevOps.setPrice(new BigDecimal("199"));
		springCoreDevOps.setImageUrl("SpringCoreDevOps.png");
		springCoreDevOps.getProductCategories().add(springCoreCat);
		springCoreDevOps.getProductCategories().add(springBootCat);
		this.productService.addProduct(springCoreDevOps);

		log.debug(">>>>>>> Initialized product data: " +
				this.productService.getProductCount());

	}// End of loadProducts()

}///:~