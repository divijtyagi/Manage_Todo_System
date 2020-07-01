package com.rest.webservices.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin()
@RestController
public class HelloWorldController {
	@GetMapping("hello-world")
	public String helloWorld() {
		return "hello world";
	}
	@GetMapping("hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello world-changed");
	}
	@GetMapping("hello-world-pathvariable/{name}")
	public HelloWorldBean helloPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello world ,%s", name));
	}

}
