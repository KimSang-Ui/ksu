package com.ksu.restapi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class WebMvcConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 스프링 부트 3버전 람다문법을 써야 에러가 안납니다.
    // jwt 토큰 인증을 달겠다.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // post 방식, put 방식, delete 방식을 사용할 때 csrf 토큰을 사용하지 않겠다.
        // 허용해주겠다.
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
        http.authorizeRequests(
//                req ->
//                        req.requestMatchers("/member", "test").permitAll().
//                                anyRequest().authenticated() //member 와 test 부분의 url을 쓸수 있도록 허용한다.
                req -> req.anyRequest().permitAll() // 모든 부분의 url을 받아들여라
        );

        Exceptionhandling ->

        http.addFilter(filter);
        //스프링시큐리티에서 필터를 다는 방법

//        인터셉터
                http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
//        유저 관리하는 매니저 클래스
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//        로그인 할 수 있는 유저 생성
        UserDetails userDetails = User.withUsername("user")
                .password(passwordEncoder().encode("1234"))
                .roles("USER")
                .build();
        //유저관리 하는 매니저 클래스에 유저 등록
        userDetailsManager.createUser(userDetails);

        //유저 관리하는 매니저 IOC 컨테이너에 등록 -> securityConfig에서 사용
        return userDetailsManager;
    }


}
