package com.example.publisherdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PublisherdemoApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping("/name")
	public String getName() {
		return "Fan Liu";
	}

	public static void main(String[] args) {
		SpringApplication.run(PublisherdemoApplication.class, args);
	}
}
