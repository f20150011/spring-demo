package com.sapient.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sapient.spring.configuration.HelloWorldConfig;
import com.sapient.spring.domain.IHelloWorld;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		IHelloWorld bean = (IHelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Shriram");
		context.close();
		
	}

}

