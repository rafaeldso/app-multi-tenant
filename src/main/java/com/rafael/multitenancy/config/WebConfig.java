package com.rafael.multitenancy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.rafael.multitenancy.filter.MultiTenancyInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println(">>>> WebConfig: addInterceptors() - Inicio/FIM");
		registry.addInterceptor(new MultiTenancyInterceptor());
	}
	
	@Bean
	public MultitenancyProperties multitenancyProperties() {
		System.out.println(">>>> WebConfig: multitenancyProperties() - Inicio/FIM");
		return new MultitenancyProperties();
	}
}
