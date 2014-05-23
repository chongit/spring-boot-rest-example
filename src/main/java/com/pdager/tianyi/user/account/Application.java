package com.pdager.tianyi.user.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer {
	private final static Logger logger = LoggerFactory
			.getLogger(Application.class);
	private static Class<Application> applicationClass = Application.class;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(applicationClass, args);
		logger.info("Servlet Container Startup.");
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

}
