package com.sapient.spring.domain;

public class HelloWorldImpl implements IHelloWorld {

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
}
