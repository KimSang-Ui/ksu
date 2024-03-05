package org.example;

import org.example.conf.MyConf;
import org.example.user.User;
import org.example.user.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConf.class);

        User user1 = User.builder()
                .email("aaa@naver.com")
                .name("김")
                .password("1234")
                .build();

        User user2 = User.builder()
                .email("bbb@naver.com")
                .name("박")
                .password("5678")
                .build();
        User user3 = User.builder()
                .email("ccc@naver.com")
                .name("박")
                .password("9012")
                .build();


        UserService userService = context.getBean(UserService.class);
        userService.Regist(user1);
        userService.Regist(user2);
        userService.Regist(user3);

        userService.list();

    }
}