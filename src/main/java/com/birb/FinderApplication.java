package com.birb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
public class FinderApplication {

	public static void main(String[] args) {

		SpringApplication.run(FinderApplication.class, args);
	}
}
