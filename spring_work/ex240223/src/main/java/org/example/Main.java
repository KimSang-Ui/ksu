package org.example;

import component.AA;
import component.BB;
import conf.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

        AA aa = context.getBean(AA.class);
        BB bb = context.getBean(BB.class);

        System.out.println(aa);
        System.out.println(bb);


    }
}