package com.git.ex03.myanno;

//실행 중에 사용되는 어노테이션
//클래스 위에 붙일 수 있다.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ManualBean {

}
