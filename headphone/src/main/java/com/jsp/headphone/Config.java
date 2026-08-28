package com.jsp.headphone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = {"com.jsp.headphone","com.owner" })
public class Config {
	
	@Bean
	public String getObj() {
		return new String();
	}

}
