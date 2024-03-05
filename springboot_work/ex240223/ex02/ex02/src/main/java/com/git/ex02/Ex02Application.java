package com.git.ex02;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex02Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ex02Application.class, args);

		String str[] = context.getBeanDefinitionName();
		for (String temp : str){
			System.out.println(temp);
		}
	}

}
