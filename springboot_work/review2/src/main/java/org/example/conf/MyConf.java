package org.example.conf;


import org.example.user.UserDAO;
import org.example.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.user","org.example.conf"})
public class MyConf {


//    @Bean
//    public UserService userService() {
//        return new UserService();
//    }
//
//    @Bean
//    public UserDAO userDAO() {
//        return new UserDAO();
//    }
}