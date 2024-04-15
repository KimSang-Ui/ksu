package org.example.UniversityTimeTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UniversityTimeTableApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UniversityTimeTableApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(UniversityTimeTableApplication.class);
    }
}