package com.jsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfig {
	
	@Bean
	public Sim  getSim() {
		return new Sim();
	}

}
