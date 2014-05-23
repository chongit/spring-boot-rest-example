package com.pdager.tianyi.user.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {
	private final static Logger logger = LoggerFactory
			.getLogger(Application.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		logger.info("Servlet Container Startup.");
	}

}
