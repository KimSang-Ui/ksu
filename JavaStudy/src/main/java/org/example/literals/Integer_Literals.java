package org.example.literals;

//리터럴
//- 자료형을 기반으로 표현이 되는 상수를 의미한다.
//  ex) int num1 = 5 + 7;
//  ex) double num2 = 3.3 + 4.5;
//- 정수는 무조건 int형으로 인식하기로 약속되어 있음
//- 따라서 5와 7은 '정수형 리터럴'이다.
//- 그리고 3.3과 4.5는 '실수형 리터럴'이다.
// '리터럴'이라는 표현은 '상수'라는 표현으로 대신하는 경우가 많다.
public class Integer_Literals {
    public static void main(String[] args) {
        int num1 = 123;           // 10진수 표현
        int num2 = 0123;         // 8진수 표현
        int num3 = 0x123;        // 16진수 표현

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        System.out.println("11 + 22 + 33 = " + (11 +22 +33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
    }
}
// 정수형 상수의 이진수 표현방법과 언더바 삽입
//byte seven = 0B111;
//int num205 = 0B11001101;
//0B 또는 0b를 붙여서 이진수 표현
//
//int num = 100_000_000;
//int num = 12_34_56_78_90;
//원하는 위치에 언더바 삽입 가능