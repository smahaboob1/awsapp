package com.employee.management;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("deprecation")
@SpringBootApplication
@ComponentScan(basePackages ="com.employee.management")
public class Application extends SpringBootServletInitializer {

	//logging
	static final Logger logger  = LogManager.getLogger(Application.class.getName());
	
	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder  application) {
	      return application.sources(Application.class);
	   }
	
	public static void main(String[] args) {
		logger.info("entered application");
		SpringApplication.run(Application.class, args);

	}

}
