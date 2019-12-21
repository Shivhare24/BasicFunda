package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	
	@Bean
	public Line line() {
		return new Line();
	}
	
	@Bean(initMethod ="init")
	@Scope("prototype")
	public Point point() {
		return new Point();
	}

}
