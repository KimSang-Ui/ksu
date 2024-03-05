package org.example.conf;

import org.example.aspect.TimeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"org.example.aspect","org.example.components"})
public class AppCtx {

    @Bean
    public TimeAspect timeAspect()
    {
        return new TimeAspect();
    }
}
