package org.lion.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.lion"})
public class Application {
	private static final Logger logger=LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
			ApplicationContext ctx = SpringApplication.run(Application.class, args);  
	        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();  
	        for (String profile : activeProfiles) {  
	            logger.warn("LION 使用profile为:{}" , profile);  
	        }
	        logger.warn("---------LION IS READY---------");  
	}
}
