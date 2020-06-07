package com.megha.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.megha.demo.model.repository.MeghaRepository;

@SpringBootApplication
@ComponentScan
@EnableMongoRepositories(basePackageClasses = MeghaRepository.class)
public class MeghaApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(MeghaApplication.class, args);
	}

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(MeghaApplication.class);
	 }
	
}
