package org.example.literals;

//long형 리터럴(상수)의 표현방법

public class Long_Literals {
    public static void main(String[] args) {
//        System.out.println(3147483647 + 3147483648);// int가 자동으로 들어가기 때문에 int형 안에 담기에는 값이 크다라는 오류 메시지를 전달한다.
        System.out.println(3147483647L + 3147483648L);// L을 붙여서 long형 상수로 표현해 달라는 요청을 해야한다.
    }
}
