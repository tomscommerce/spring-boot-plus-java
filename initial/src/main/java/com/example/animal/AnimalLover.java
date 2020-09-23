package com.example.animal;

import java.util.Arrays;
import com.example.springboot.Dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnimalLover {

	public static void main(String[] args) {
		Dog dog = new Dog(1, "cattledog");
		
		
		
		ApplicationContext ctx = SpringApplication.run(AnimalLover.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
	
}
