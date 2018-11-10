package com.example.publisherdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@SpringBootApplication
@RestController
public class PublisherdemoApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello from publisher!";
	}

	@RequestMapping("/name")
	public String getName() {

		List<String> nameList = Arrays.asList("Beijing", "Shanghai", "GuangZhou", "Shenzhen");
		Random random = new Random();
		String cityName = nameList.get(random.nextInt(nameList.size()));
		return "Hello from publisher: " + cityName;
	}

	public static void main(String[] args) {
		SpringApplication.run(PublisherdemoApplication.class, args);
	}
}
