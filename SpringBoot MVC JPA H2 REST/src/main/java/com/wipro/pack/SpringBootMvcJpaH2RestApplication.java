package com.wipro.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wipro.pack"})
public class SpringBootMvcJpaH2RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcJpaH2RestApplication.class, args);
	}

}
