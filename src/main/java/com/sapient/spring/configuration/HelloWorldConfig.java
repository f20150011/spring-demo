package com.sapient.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.sapient.spring.domain.HelloWorldImpl;
import com.sapient.spring.domain.IHelloWorld;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	@Description("This is a sample HelloWorld Bean")
	public IHelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
}
