package com.jsp.VariableLevelDI;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jsp.VariableLevelDI" , "com.jsp.methodLevelDI"})
public class Config {

}
