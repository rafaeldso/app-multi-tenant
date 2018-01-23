package com.rafael.multitenancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MultiTenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiTenancyApplication.class, args);
	}
}
