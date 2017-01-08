package com.gdn.demo.future;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean()
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public CustomAnimal customAnimal() {
		return new CustomAnimal("Tahu bulat", "Terbang pake jetpack", "OM TELOLET OM");
	}
}
