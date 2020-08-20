package com.wipro.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.pack.bean.Laptop;

@SpringBootApplication
public class SpringBootIntroductionDependencyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext c=SpringApplication.run(SpringBootIntroductionDependencyApplication.class, args);
	Laptop l=c.getBean(Laptop.class);
	System.out.println(l);
	}

}
