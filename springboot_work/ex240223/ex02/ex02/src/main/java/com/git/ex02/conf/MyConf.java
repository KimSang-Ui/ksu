package com.git.ex02.conf;

import components.AA;
import components.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

    @Bean
    public AA aa(){
        return new AA();
    }
    public BB bb(){
        return new BB();
    }
}
