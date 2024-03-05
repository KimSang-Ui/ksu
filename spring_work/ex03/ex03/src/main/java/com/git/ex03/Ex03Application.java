package com.git.ex03;

import com.git.ex03.component.BB;
import com.git.ex03.component.CC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//configuration
//ComponentScan

@SpringBootApplication
public class Ex03Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ex03Application.class, args);

		String[] str = context.getBeanDefinitionNames();
		for(String temp : str){
			System.out.println(temp);
		}

	}

	@Bean
	public BB bb(){
		return new BB();
	}

	@Bean
	public CC cc() {return new CC();}

}
